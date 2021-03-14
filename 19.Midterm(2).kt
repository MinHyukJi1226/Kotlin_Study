// 1) 사칙 연산을 수행할 수 있는 클래스

// 2) 은행 계좌 만들기
// 계좌 생성 기능 (이름, 생년 월일)
// 잔고를 확인 하는 기능
// 출금 기능
// 예금 기능

// 3) Tv 클래스
// On, Off 기능
// 채널을 돌리는 기능
// 초기 채널은 (S사 M사 K사 3개)

class Calculation() { // 내가 만든 것
    fun plus (number1: Int, number2: Int){
        println("$number1 + $number2 = ${number1 + number2}")
    }
    fun min (number1: Int, number2: Int){
        println("$number1 - $number2 = ${number1 - number2}")
    }
    fun mul (number1: Int, number2: Int) {
        println("$number1 X $number2 = ${number1 * number2}")
    }
    fun div (number1: Int, number2: Int){
        println("$number1 / $number2 = ${number1 / number2}")
    }
}

class Calculator2() {
    fun plus(vararg numbers : Int){
        var result = 0
        numbers.forEach {
            result += it
        }
       println(result)
    }

    fun minus(vararg numbers : Int){
        var result : Int = numbers[0]
        for (i in 0 until numbers.size) {
            if (i != 0) {
                result -= numbers[i]
            }
        }
        println(result)
    }

    fun mul(vararg numbers : Int){
        var result = 1
        numbers.forEach {
            if (it != 0) {
                result *= it
            }
        }
        println(result)
    }

    fun div(vararg numbers : Int){
        var result : Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0){
                if (value != 0) {
                    result = result / value
                }
            }
        }
        println(result)
    }


}

class Calculator3(var initialValue: Int) {
    fun plus(number: Int) : Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int) : Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun mul (number: Int) : Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun div (number: Int) : Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }
}

class Bank() { // 내가 만든 것
    var name : String = ""
    var birth : String = ""
    var money : Int = 0

    constructor(name : String, birth : String, money: Int) : this() {
        this.name = name
        this.birth = birth
        this.money = money
    }

    fun Balance (){
        println("현재 남은 잔고는 $money 원 입니다")
    }
    fun Withdrawal (getMoney : Int) {
        money -= getMoney
        println("$getMoney 원이 출금 되었습니다. 현재 남은 금액 : $money")
    }
    fun Deposit (addMoney : Int) {
        money += addMoney
        println("$addMoney 원이 예금 되었습니다. 현재 남은 금액 : $money")
    }
}

class Account {
    val name : String
    val birth : String
    var balance : Int

    constructor(name : String, birth: String, balance : Int){
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }
    }

    fun checkBalance() : Int {
        return balance
    }
    fun withdraw(amount : Int) : Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }
        fun save(amount: Int) {
            balance += amount
        }
    }

class Account2(val name: String, val birth: String, var balance: Int = 1000){
    fun checkBalance() : Int {
        return balance
    }
    fun withdraw(amount : Int) : Boolean {
        if (balance >= amount) {
            balance = balance - amount
            return true
        } else {
            return false
        }
    }
    fun save(amount: Int) {
        balance += amount
    }
}

class Account3(initialBalance : Int){

    val balance : Int = if (initialBalance >= 0) initialBalance else 0

    fun checkBalance () : Int{
        return balance
    }
}

class TV(val channels : List<String>){
    var onOrOFf : Boolean = false
    var currentChannelNumber = 0
    set(value) {
        field = value
        // currentChannelNumber = value -> set은 값에 할당할때 호출이 되는 함수 인데 이 코드를 넣으면 계속 할당되기 때문에 무한 루프에 걸림
        if (field > 2){
            field = 0
        }
        if (field < 0) {
            field = 2
        }
    }
    // get은 호출될때
    // 값의 할당
    // a = b

    fun switch(){
        onOrOFf = !onOrOFf
    }

    fun checkCurrentChannel() :String {
        return channels[currentChannelNumber]
    }
    fun channelUp(){
        currentChannelNumber = currentChannelNumber + 1
        //channels.forEachIndexed { index, value ->
            //if(currentChannelNumber == index)
                //currentChannelNumber = currentChannelNumber + 1
                //return
        //}
    }
    fun channelDown () {
        currentChannelNumber = currentChannelNumber - 1
        //channels.forEachIndexed { index, value ->
            //if(currentChannelNumber == index)
                //currentChannelNumber = currentChannelNumber - 1
                //return
       //}
    }
}

fun main (array: Array<String>) {
    val calculation : Calculation = Calculation()

    calculation.plus(4, 5)
    calculation.min(4, 5)
    calculation.mul(4, 5)
    calculation.div(4, 5)

    println()

    val calculator2 : Calculator2 = Calculator2()

    calculator2.plus(1, 2, 3, 4, 5)
    calculator2.minus(10, 1, 2, 3)
    calculator2.mul(1, 2, 3)
    calculator2.div(10, 2, 3)

    println()

    val calculator3 : Calculator3 = Calculator3(3)
    calculator3.plus(5).minus(5)
    // Chaining (체이닝)

    println()

    val bank : Bank = Bank("지민혁", "2004.12.26", 100000)
    bank.Balance()
    bank.Deposit(10000)
    bank.Withdrawal(10000)

    println()

    val account : Account = Account("홍길동", "1990/3/1", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()

    val account2 : Account = Account("홍길동", "1990/3/1", -2000)
    println(account2.checkBalance())

    println()

    val account3 : Account2 = Account2("홍길동", "1990/3/1")
    val account4 : Account2 = Account2("홍길동", "1990/3/1", 4000)
    println(account3.checkBalance())

    println()

    val channels = listOf<String>("K", "M", "S")
    val tv = TV(channels)

    tv.switch()
    println(tv.onOrOFf)
    tv.switch()
    println(tv.onOrOFf)

    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
}