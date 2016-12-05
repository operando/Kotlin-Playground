// sealedを付けられたクラスを継承できるのは、その内部クラスだけ
sealed class TaskStatus {
    class New(val id: Long) : TaskStatus()
    class Running(val id: Long, val date: String) : TaskStatus()
    class Close(val id: Long, val close: Boolean) : TaskStatus()
    object None : TaskStatus()
}