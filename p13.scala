object BinarySearch {

  def binarySearch(sortedList: List[Int], target: Int): Boolean = {
    // Helper function to perform recursive search
    def searchHelper(list: List[Int], low: Int, high: Int): Boolean = {
      if (low > high) {
        false // Target not found
      } else {
        val mid = low + (high - low) / 2
        if (list(mid) == target) {
          true
        } else if (list(mid) > target) {
          searchHelper(list, low, mid - 1)
        } else {
          searchHelper(list, mid + 1, high)
        }
      }
    }

    searchHelper(sortedList, 0, sortedList.length - 1)
  }

  def main(args: Array[String]): Unit = {
    val sortedList = List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19)
    val target = 98

    val result = binarySearch(sortedList, target)
    println(s"Is $target in the list? $result")
  }
}
