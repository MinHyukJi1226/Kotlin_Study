// 자료형
//정수형 -> long > Int > Short > Byte
//실수형 -> Double > Float
//문자 -> Char 문자 한글자
//문자형 -> String 문자 여러글자
//논리형 (참 True / 거짓 False) -> Boolean
// 자료형옆에 ?를 붙으면 null을 가질수 있는 자료형이 된다.

var number = 10

// 변수를 선언하는 방법 2
// var/val 변수명 : 자료형 = 값

var number1 : Int = 20
var hello1 : String = "hello"
var point1 : Double = 3.4

// Variable or Value??
// - 1. 변하지 않는 값이라면 Value
// - 2. 진짜 모르겠다! -> Variable

fun main(array: Array<String>){
    number = 20
    //number = 20.5 이변수는 정수형인데 실수형을 넣었기때문에 오류
}