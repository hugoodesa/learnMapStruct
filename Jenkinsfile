pipeline {
    agent any

    tools {
        maven 'local_maven'
        jdk 'local_java'
    }

    stages {
        stage('Build') {
            steps {
                echo 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('local_sonar') {
                    // Use 'sh' if your Jenkins agent is running on a Unix-like environment
                    // Replace 'sh' with 'bat' if your Jenkins agent is running on Windows
                    sh '''
                        mvn clean verify sonar:sonar \
                        -Dsonar.projectKey=learnJenkins \
                        -Dsonar.projectName='learnJenkins' \
                        -Dsonar.host.url=http://sonar:9000
                    '''
                    echo 'SonarQube Analysis Completed'
                }
            }
        }

        stage('Tomcat deploy') {
            steps {
                echo 'start TOMCAT DEPLOY'
                deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://tomcat9:8082')], contextPath: '/var/jenkins_home/workspace/pipelineDev/target/learnMapStruct-0.0.1-SNAPSHOT.jar', onFailure: false, war: 'learnMapStruct-0.0.1-SNAPSHOT.jar'
            }
        }
        
    }
}
