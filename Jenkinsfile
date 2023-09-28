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
                // Build your FFL-automation project
                {
                    sh 'mvn clean'
                }
            }
        }
        stage('Run Tests') {
            steps {
                // Run tests in FFL-automation project
            //    dir('BOA-FFL-AUTOMATION-SUITE')
                  {
                    script {
                        try {
                            sh 'mvn test'
                        } catch (Exception e) {
                            currentBuild.result = 'FAILURE'
                            echo "Test execution failed, but continuing..."
                        }
                    }
                }
            }
        }
        stage('Generate Allure Report') { 
            steps {
                script {
                    ws('/var/lib/jenkins/workspace/BOA-Automation-project/BOA-FFL-Automation-Suite') {
                        // Correct the syntax for invoking the Allure report generation
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