import kotlin.concurrent.thread

//outPut is nothing
fun diceRolled(times:Int,range:IntRange,callBack:(result:Int)->Unit){
    for (i in 0..times){
        val result=range.random()
        callBack(result)
    }
}

//valued argument parameter

fun diceRolled(callBack: ((result: String) -> Unit)?=null){
   callBack?.invoke("downloading Started")
    thread {
        Thread.sleep(3000)
        callBack?.invoke(higherOrderMultiply(::multiply).toString())
    }
}

fun add(a: Int, b: Int):Int=a + b


fun higherFunc(addFunc:(Int,Int)-> Int){
    val result = addFunc(3,6)
    println("The sum of two numbers is: $result")
}


fun multiply(a:Int,b:Int):Int=a*b
fun higherOrderMultiply(callBack: (Int,Int)->Int):Int{
    return callBack(3,6)
}


fun main() {
//   diceRolled(4,(1..6)){ println(it) }
    diceRolled{ println(it) }
//    higherFunc(::add)
//    higherOrderMultiply(::multiply)
}