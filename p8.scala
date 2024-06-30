object ItemCollection2 {

  def main(args: Array[String]): Unit = {
    // Initialize the collection of items
    var items = Map(
      "Pen" -> 20,
      "Pencil" -> 10,
      "Eraser" -> 7,
      "Book" -> 25,
      "Sheet" -> 15
    )

    // i. Display item-name and quantity
    println("Item names and quantities:")
        items.foreach(println)

    // ii. Display sum of quantity and total number of items
    val totalQuantity = items.values.sum
    val itemCount = items.size
    println(s"\nTotal quantity: $totalQuantity")
    println(s"Total number of items: $itemCount")

    // iii. Add 3 Books to the collection
    items = items.updated("Book", items("Book") + 3)

    // Add new item “Board” with quantity 15 to the collection
    items = items + ("Board" -> 15)

    // Display updated items
    println("\nUpdated item names and quantities:")
    items.foreach(println)
  }
}
