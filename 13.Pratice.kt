fun main(array:Array<String>){
    val array = arrayOf<Int>(1, 2, 3)

    //get, set
    val number = array.get(0)
    println(number)
    // val number1 = array.get(100) // 인덱스에 주의 해야 한다

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    array.set(100, 100)

    // Array Bounds
    // 처음 만들때 결정 된다

    // Array를 만드는 방법 (3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 'C') // char -> ' ', String -> " "
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)

    //Array를 만드는 방법 (4) -> lamda 를 활용한 방법
    val a5 = Array(10, { 0 }) //
    val a6 = Array(5, { 1;2;3;4;5 }) //
}