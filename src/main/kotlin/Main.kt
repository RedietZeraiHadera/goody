fun main(){
    greetPerson("Shalom")
    greetPerson("Chappy")
    var n=division(num1 = 34, num2 = 3)
    println(n)
    var sum=addition(num1 = 12, num2 = 7, num3 = 9, num4 = 10)
    println(sum)
    var String="I make a funny face when I am nervous."
    println(String)
}
fun greetPerson(name:String){
    println("Hello$name")
}
fun division(num1:Int, num2:Int): Int{
    return(num1%num2)
}
fun addition(num1:Int,num2: Int,num3:Int,num4:Int):Int{
    var sum = num1+num2+num3+num4
    return(sum)
}
fun statement(me:String): String{
    return(me)
}
