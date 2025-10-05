def call(String MAVEN_TOOL_NAME) {
    stage('Compile') {
        echo "--> Starting Maven Compilation"
        sh "${tool(MAVEN_TOOL_NAME)} clean compile"
    }

    stage('Test') {
        echo "--> Running Unit Tests"
        sh "${tool(MAVEN_TOOL_NAME)} test"
    }

    stage('Package') {
        echo "--> Creating final application package"
        sh "${tool(MAVEN_TOOL_NAME)} package"
    }
}

