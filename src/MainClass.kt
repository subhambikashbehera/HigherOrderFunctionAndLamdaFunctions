import kotlin.concurrent.thread

//outPut is nothing
fun diceRolled(times:Int,range:IntRange,callBack:(result:Int)->Unit){
    for (i in 0..times){
        val result=range.random()
        callBack(result)
    }
}

//valued argument parameter

fun diceRolled(callBack: ((result: Int) -> Unit)?=null):String{
    thread {
        Thread.sleep(3000)
        callBack?.invoke(5)
    }
    return "downloading Started"
}


fun main() {
//    diceRolled(4,(1..6)){
//        println(it)
//    }
    val value=diceRolled{
        println(it)
    }
    println(value)

}