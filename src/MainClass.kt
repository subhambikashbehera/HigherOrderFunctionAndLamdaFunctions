


fun diceRolled(times:Int,range:IntRange,callBack:(result:Int)->Unit){
    for (i in 0..times){
        val result=range.random()
        callBack(result)
    }
}




fun main() {
    diceRolled(4,(1..6)){
        println(it)
    }



}