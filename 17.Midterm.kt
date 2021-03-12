fun first() {
// 1번 문제
// List를 두개 만든다
// 첫번째 List에는 0 부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번재 List의 값을 하나씩 확인한후
// 짝수면 True 홀수면 False를 넣어 준다

    var firstList = mutableListOf<Int>()
    var secondList = mutableListOf<Boolean>()

    for (i in 0..8) {
        firstList.add(i, i + 1)
        if (firstList[i] % 2 == 0){
            secondList.add(i, true)
        } else {
            secondList.add(i, false)
        }
    }
    println(firstList)
    println(secondList)
}

fun second(){
// 2번 문제
// 학점을 구하자
// 100 - 80 -> A
// 70 - 79 -> B
// 60 -> 69 -> C
// 나머지 F

    fun grade(score : Int) : String {
        if (score >= 80 && score <= 100){
            return "A"
        } else if (score >= 70 && score <= 79){
            return "B"
        } else if (score >= 60 && score <= 69){
            return "C"
        } else {
            return "F"
        }
    }
    println(grade(80))
}

fun third() {
// 3번 문제
// 전달 받은 숫자의 각 자리 숫의 합을 구하자
// 조건 : 전달 잡은 숫자는 무조건 두자리 숫자이다
    fun doublePlus (number: Int) : Int {
        val first = number / 10
        val second = number % 10
        val value = first + second

        return value

    }
    println(doublePlus(57))
}

fun fourth(){
// 4번 문제
// 구구단을 출력하자
    fun gugudan(){
        for (i in 1..9){
            for (j in 1..9){
                println("$i x $j = " + i * j)
            }
        }
    }
    gugudan()
}
fun main (array: Array<String>) {
    first()
    println()
    second()
    println()
    third()
    println()
    fourth()
}