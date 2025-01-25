package section2.code1

import kotlinx.coroutines.runBlocking

// 메인쓰레드를 점유하는 코루틴을 만들어낸다.
fun main() = runBlocking<Unit>  {
    println("hello coroutines!!")
}