pipeline {
    agent any
        stages {
            stage ('Initialize') {
                steps {
                    sh '''
                        echo "PATH = ${PATH}"
                        echo "MAVEN_HOME = ${MAVEN_HOME}"
                        echo "JAVA_HOME = ${JAVA_HOME}"
                        echo "ALLURE_HOME = ${ALLURE_HOME}"
                    '''
                }
            }
            stage('Compile Stage') {
                 steps{
                     sh 'mvn clean compile'
                 }
            }
            stage('Test Stage') {
                  steps{
                      sh 'mvn test -DsuiteXmlFile="testng.xml"'
                  }
            }
            post {
                  always {
                    script {
                      allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']]
                      ])
                    }
                  }
                }

       }
    }