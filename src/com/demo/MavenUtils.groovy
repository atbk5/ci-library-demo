package com.demo

class MavenUtils implements Serializable {

    private def script

    MavenUtils(script) {
        this.script = script
    }

    def runStandardBuild(String toolName) {
  
        script.withMaven(maven: toolName) {
            
            script.stage('Compile') {
                script.echo "--> Starting Maven Compilation using plugin environment for tool: ${toolName}"

                script.sh "mvn clean compile"
            }

            script.stage('Test') {
                script.echo "--> Running Unit Tests"
                script.sh "mvn test"
            }

            script.stage('Package') {
                script.echo "--> Creating final application package (JAR/WAR)"
                script.sh "mvn package"
            }
            
            script.echo "--- Java Build Logic Executed within withMaven Block ---"
        }
    }
}
