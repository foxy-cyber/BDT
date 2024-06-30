import scala.io.StdIn

object LongestWordFinder {

  def main(args: Array[String]): Unit = {
    // Read words from the keyboard
    println("Enter words separated by spaces:")
    val input = StdIn.readLine().split("\\s+").toList

    // Find the word with the highest length
    val (longestWord, maxLength) = findLongestWord(input)

    // Print the result
    println(s"The word with the highest length is '$longestWord' with length $maxLength.")
  }

  def findLongestWord(words: List[String]): (String, Int) = {
    if (words.isEmpty) {
      ("", 0) // Return empty string and 0 if the list is empty
    } else {
      words.map(word => (word, word.length)).maxBy(_._2)
    }
  }
}
