def call(String userName) {
    echo "--- [vars/greetUser.groovy] ---"
    echo "Hello, ${userName}! The library execution is starting."
    echo "Current build number is: ${this.env.BUILD_NUMBER}"
    
    // Call the class method defined in the src/ folder
    def utility = new com.demo.UtilityClass(this)
    utility.runSampleMethod(userName)
    
    echo "--- [vars/greetUser.groovy] Execution Finished ---"
}
