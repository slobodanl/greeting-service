pipeline {
    agent any
    tools {
        jdk 'Corretto-11'
    }
    stages {
        stage('Build') {
            steps {
                sh 'printenv'
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
