package section3.code4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {

    launch(Dispatchers.Default) {
        for (i in 1..20) {
            launch{
                println("${Thread.currentThread().name} 작업 ${i} 실행")
            }
        }
    }
// test copilot222

}