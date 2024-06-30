object BookCountByAuthor {

  def main(args: Array[String]): Unit = {
    // Given collection of (authorName, BookName)
    val books = List(
      ("Dr. Seuss", "How the Grinch Stole Christmas!"),
      ("Jon Stone", "Monsters at the End of This Book"),
      ("Dr. Seuss", "The Lorax"),
      ("Jon Stone", "Big Bird in China"),
      ("Dr. Seuss", "One Fish, Two Fish, Red Fish, Blue Fish")
    )

    // Calculate the number of books published by each author
    val bookCountByAuthor = books.groupBy(_._1).view.mapValues(_.size).toMap

    // Print the result
    println("Number of books published by each author:")
    bookCountByAuthor.foreach(println)
  }
}
