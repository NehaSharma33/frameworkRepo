pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout source code from Git repository
                git 'https://github.com/NehaSharma33/frameworkRepo.git''
            }
        }

        stage('Build') {
            steps {
                // Run a Windows batch command to build the project
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run a Windows batch command to run tests
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            // Send email notification on successful build
            emailext (
                subject: "Build ${currentBuild.fullDisplayName} succeeded",
                body: "Build ${currentBuild.fullDisplayName} succeeded. No further action required.",
                to: "mayi.neha@gmail.com"
            )
        }
        failure {
            // Send email notification on failed build
            emailext (
                subject: "Build ${currentBuild.fullDisplayName} failed",
                body: "Build ${currentBuild.fullDisplayName} failed. Please investigate and take necessary actions.",
                to: "mayi.neha@gmail.com"
            )
        }
    }
}
