fun main(array: Array<String>){

    val a : Int? = null
    val b : Int = 10
    val c : Int = 100

    if (a == null){
        println("a is null")
    } else {
        println("a is not null")
    }


    if (b + c == 110){
        println("b plus c equal 110")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자
    val number : Int? = null
    val number2 = number ?: 10
    // number가 null일 경우 10이 들어감 null이 아닐 경우는 number의 값
    println()
    println(number2)

    val num1 : Int = 10
    val num2 : Int = 20

    val max = if (num1 > num2){
        num1
    } else if (num1 == num2){
        num2
    } else {
        100
    } // 값을 "무조건" 리턴헤야함!
}