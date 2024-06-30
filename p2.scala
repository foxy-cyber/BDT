import scala.io.StdIn

object WordLength {

  def main(args: Array[String]): Unit = {
    print("Enter words separated by spaces:")
    val input = StdIn.readLine().split("\\s+")
    
    if (input.isEmpty) {
      println("No words entered.")
    } else {
      val longestWord = input.maxBy(_.length)
      println(s"The word with the highest length is '$longestWord' with length ${longestWord.length}.")
    }
  }
}
