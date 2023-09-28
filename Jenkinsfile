pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Test') {
            steps {
                sh "cd /var/lib/jenkins/workspace/allurereport/ffl_allure && mvn clean"
                sh "cd /var/lib/jenkins/workspace/allurereport/ffl_allure && mvn test"
                sh "allure generate /var/lib/jenkins/workspace/allurereport/ffl_allure/allure-results -o /var/lib/jenkins/workspace/allurereport/ffl_allure/allure-report"
            }
        }
    }
}
