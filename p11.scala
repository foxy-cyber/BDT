import scala.io.StdIn
object FactorialCalculation {

  // Function to calculate the factorial of a single integer
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  // Main function to read input, calculate factorials, and print results
  def main(args: Array[String]): Unit = {
    // Read input from the standard input and split it into integers
    val inputNumbers = StdIn.readLine().split(" ").map(_.toInt)

    // Calculate factorial for each input number
    val factorialResults = inputNumbers.map(factorial)

    // Print results
    println("Factorial results:")
    factorialResults.foreach(println)
  }
}