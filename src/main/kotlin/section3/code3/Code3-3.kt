package section3.code3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {

    for (i in 1..20){
        launch(Dispatchers.IO) {
            println("${Thread.currentThread().name} 작업 ${i} 실행")
        }
    }
    launch(Dispatchers.IO) {
        println("${Thread.currentThread().name} 이후 작업 1 실행")
    }
    launch(Dispatchers.IO) {
        println("${Thread.currentThread().name} 이후 작업 2 실행")
    }
    launch(Dispatchers.IO) {
        println("${Thread.currentThread().name} 이후 작업 3 실행")
    }

}