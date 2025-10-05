package com.demo

/**
 * Utility class to show structured logic inside the shared library.
 * Implements Serializable to allow the pipeline state to be saved/restored.
 */
class UtilityClass implements Serializable {
    // Holds the reference to the pipeline execution environment
    private def script

    // Constructor: Takes the pipeline context and saves it to the 'script' field.
    UtilityClass(def script) {
        this.script = script
    }

    /**
     * Executes a sample method that uses the pipeline context to print messages.
     * @param name The name passed from the calling vars/ function.
     */
    def runSampleMethod(String name) {
        script.echo "--- [src/com/demo/UtilityClass.groovy] ---"
        script.echo "UtilityClass running structured task for: ${name}"
        
        // Example of using another built-in Jenkins step
        script.stage('Class-Based Logic') {
            script.echo "This stage was triggered from the shared library class."
        }
    }
}
