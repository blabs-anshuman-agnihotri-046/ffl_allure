pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    // Build your FFL-automation project
                    sh 'mvn clean'
                }
            }
        }
        stage('Run Tests') {
            steps {
                script {
                    try {
                        // Run tests in FFL-automation project
                        sh 'mvn test'
                    } catch (Exception e) {
                        currentBuild.result = 'FAILURE'
                        echo "Test execution failed, but continuing..."
                    }
                }
            }
        }
        stage('Generate Allure Report') {
            steps {
                script {
                    // Assuming your workspace is correct, you can directly use allure()
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'allure-results']]
                    ])
                }
            }
        }
    }
    post {
        failure {
            script {
                def allureReportUrl = "http://jenkins.masterffl.com/job/BOA-Automation-project/allure/"
                emailext (
                    subject: "Pipeline Failed: ${currentBuild.fullDisplayName}",
                    body: """Hi Team,
                           The Jenkins pipeline ${currentBuild.fullDisplayName} has failed. Please check the build logs for more details.

                           You can view the Allure report here: $allureReportUrl""",
                    to: "${result_email0}, ${failure_email0}",
                    attachLog: true
                )
            }
        }
    }
}