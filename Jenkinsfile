pipeline {
    agent any
    tools {
        jdk 'Corretto-11'
    }
    environment {
        DOCKER_HUB_COMMON_CREDS = credentials('docker-hub-common-creds')
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo $DOCKER_HUB_COMMON_CREDS'
                sh './mvnw clean package'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
