def call() {
    stage('Compile') {
        echo "--> Starting Maven Compilation"
        sh "mvn clean compile"
    }

    stage('Test') {
        echo "--> Running Unit Tests"
        sh "mvn test"
    }

    stage('Package') {
        echo "--> Creating final application package"
        sh "mvn package"
    }
}

