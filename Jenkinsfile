pipeline {
    agent any
    tools {
        jdk 'Corretto-11'
    }
    stages {
        stage('Build') {
            steps {
                sh './mvnw clean package'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Publish') {
            environment {
                DOCKER_HUB = credentials('docker-hub-common-creds')
            }
            steps {
                sh './mvnw clean compile -B -e jib:build \
                    -Djib.to.auth.username=${DOCKER_HUB_USR} \
                    -Djib.to.auth.password=${DOCKER_HUB_PSW} \
                    -DskipTests'
            }
        }
    }
}
