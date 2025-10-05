def call(String MAVEN_TOOL_NAME) {

    def utils = new com.demo.MavenUtils(this)

    utils.runStandardBuild(MAVEN_TOOL_NAME) 

}
