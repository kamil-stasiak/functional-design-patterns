class MainGroovy {
    static void main(args) {
        println "Groovy class"
        println MainJava.hello()
    }

    static String hello() {
        "Hello from Groovy"
    }
}
