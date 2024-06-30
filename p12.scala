object ItemCollection {

  def main(args: Array[String]): Unit = {
    // Initial collection of items with item names and quantities
    var items = Map("Butter" -> 20, "Bun" -> 10, "Egg" -> 7, "Biscuit" -> 25, "Bread" -> 15)

    // i. Display item-name and quantity
    println("Item names and quantities:")
    items.foreach { case (name, quantity) => println(s"$name: $quantity") }

    // ii. Display sum of quantity and total number of items
    val totalQuantity = items.values.sum
    val totalItems = items.size
    println(s"\nTotal quantity: $totalQuantity")
    println(s"Total number of items: $totalItems")

    // iii. Add 3 Buns to the collection
    items = items.updated("Bun", items("Bun") + 3)

    // iv. Add new item “Cheese” with quantity 12 to the collection
    items = items + ("Cheese" -> 12)

    // Display updated collection
    println("\nUpdated item names and quantities:")
    items.foreach { case (name, quantity) => println(s"$name: $quantity") }
  }
}
