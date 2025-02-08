package section3.code2

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

val multiThreadDispatcher: CoroutineDispatcher =
    newFixedThreadPoolContext(2,"MultiThread")


fun main() = runBlocking<Unit> {
//    println("${Thread.currentThread().name} 실행")
    launch(multiThreadDispatcher) {
        println("${Thread.currentThread().name} 실행")
    }
    launch(multiThreadDispatcher) {
        println("${Thread.currentThread().name} 실행")
    }
}