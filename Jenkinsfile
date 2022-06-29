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
                     withMaven(maven : 'maven_3_8_5'){
                          sh 'mvn clean compile'
                     }
                 }
            }
            stage('Test Stage') {
                  steps{
                      withMaven(maven : 'maven_3_8_5'){
                          sh 'mvn test -DsuiteXmlFile="testng.xml"'
                      }
                  }
            }
        }
}