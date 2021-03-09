var a = 1 + 2 + 3 + 4 + 5 // 연산의 결가값을 변수에 넣어 줄 수 있다.
var b = "1"
var c = b.toInt() // 변수 b에 있는 문자형 1을 int형으로 바꾸어 c로 넣는다. (1)
var d = b.toFloat() // 변수 b에 있는 문자형 1을 Float형으로 바꾸어 c로 넣는다. (1.0)

var e = "John"
var f = "My name is $e Nice to meet you"

    // Null
    // - 존재 하지 않는다.

    // var abc : Int = null
var abc1 : Int? = null // "null" (X)
var abc2 : Double? = null

var g = a + 3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)

    println(g)
}