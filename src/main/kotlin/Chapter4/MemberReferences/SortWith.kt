import memberreferences1.Message
import atomictest.eq

fun main() {
    val message = listOf(
        Message("Kitty", "Hey!", true),
        Message("Kitty", "Where are you?", false),
        Message("Boss", "Meeting today", false)
    )

    message.sortedWith(compareBy(
        Message::isRead, Message::sender
    )) eq
    listOf(
        //우선은 읽지 않은 메시지가 보낸 사람 순서로 정렬된다.
        Message("Boss", "Meeting today", false),
        Message("Kitty", "Where are you?", false),
        Message("Kitty", "Hey!", true)
    )
}



