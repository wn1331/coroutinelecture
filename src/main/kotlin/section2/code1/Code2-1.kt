package section2.code1

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// 메인쓰레드를 점유하는 코루틴을 만들어낸다.

// runBlocking 함수는 이 함수를 호출한 스레드를 사용해 실행되는 코루틴을 만들어낸다.
// -> runBlocking 코루틴이 종료될 때 스레드 점유가 해제된다.
// runBlocking = Run(실행) + Blocking(차단)
fun main() = runBlocking<Unit>(CoroutineName("runBlocking 코루틴"))  {
    println("[${Thread.currentThread().name}] runBlocking 코루틴 실행!!")

    launch(CoroutineName("launch 코루틴")) {
        println("[${Thread.currentThread().name}] launch 코루틴 실행!!")
    }
}