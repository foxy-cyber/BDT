object BubbleSort {

  def bubbleSort(arr: Array[Int]): Unit = {
    val n = arr.length
    for (i <- 0 until n-1) {
      for (j <- 0 until n-i-1) {
        if (arr(j) > arr(j + 1)) {
          // Swap arr(j) and arr(j + 1)
          val temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    val arr = Array(64, 34, 25, 12, 22, 11, 90)
    println("Array before sorting:")
    println(arr.mkString(", "))

    bubbleSort(arr)

    println("\nArray after sorting:")
    println(arr.mkString(", "))
  }
}
