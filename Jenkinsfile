pipeline {
    agent any

    stages {
          
            stage('Build') {
             steps {
                echo 'Building'
                bat "mvn clean -DskipTests install"
            }
            }
            stage('Test') {
             steps {
                echo 'Testing'
                bat "mvn test"
            }
            }
            stage('Approve'){
            	steps {
            		input 'Have all test cases passed ?'
            	}
            	
            }
            stage('Deploy') {
             steps {
                echo 'Deploying '
             deploy adapters: [tomcat8(credentialsId: 'tomcat-cred', path: '', url: 'http://localhost:9090/')], contextPath: null, onFailure: false, war: '**/*.war'
            }
            }
        }
}
