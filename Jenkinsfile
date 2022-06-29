pipeline {
    agent any
        stages {
            stage ('Initialize') {
                steps {
                    sh '''
                        echo "PATH = ${PATH}"
                        echo "M2_HOME = ${M2_HOME}"
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
        }
}