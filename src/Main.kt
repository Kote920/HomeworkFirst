import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    do {
        println("Enter the value for X:")
        val X = scanner.nextDouble()

        println("Enter the value for Y")
        val Y = scanner.nextDouble()

        val Z: Double = X + Y
        println("Sum of the X and Y is: $Z")

        println("Do you want to do it again? <N/Y>")
        val ANSWER: String = scanner.next()
        val checker : Boolean = ANSWER == "Y"

    }while (checker)

}