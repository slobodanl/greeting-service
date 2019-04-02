pipeline {
    agent any
    tools {
        jdk 'Corretto-11'
    }
    stages {
        stage('Build') {
            steps {
                sh './mvnw clean'
                sh 'echo "Hello World"'
            }
        }
    }
}
