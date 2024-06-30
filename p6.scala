object CapitalizeWords {

def main(args: Array[String]): Unit = {
    val sentence = "hello world from scala"
    
    val capitalizedSentence = sentence.split(" ").map(_.capitalize).mkString(" ")
    println(capitalizedSentence)
  }
}