pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage ('Git Checkout') {
            steps {
                git branch: 'main', credentialsId: '2568bhby45ggg336556', url: 'https://github.com/xtrrdnryprgrmmr/Postman-API-Test.git'
            }
        }
    }
}