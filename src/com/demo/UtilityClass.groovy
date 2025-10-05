package com.demo

class UtilityClass implements Serializable {
    def script

    UtilityClass(script) {
        this.script = script
    }
    def runSampleMethod(String name) {
        script.echo "--- [src/com/demo/UtilityClass.groovy] ---"
        script.echo "UtilityClass running structured task for: ${name}"

        script.stage('Class-Based Logic') {
            script.echo "This stage was triggered from the shared library class."
        }
    }
}
