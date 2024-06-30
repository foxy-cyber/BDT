// Define an abstract class Notification
abstract class Notification

// Define case classes extending Notification
case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification

// Define a function to show notification details using pattern matching
def showNotification(notification: Notification): String = {
  notification match {
    case Email(sender, title, _) => s"You got an email from $sender with title: $title"
    case SMS(caller, message) => s"You got an SMS from $caller! Message: $message"
  }
}

// Main object to run the program
object NotificationApp {
  def main(args: Array[String]): Unit = {
    val email = Email("john.doe@example.com", "Meeting Reminder", "Don't forget our meeting at 10 AM tomorrow.")
    val sms = SMS("Jane Doe", "See you at 7 PM!")

    println(showNotification(email))
    println(showNotification(sms))
  }
}
