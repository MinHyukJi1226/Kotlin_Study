// Collection
// -> list, set, map

// List

fun main(args:Array<String>){
    // Immutablle Collection 변경 불가능
    // List -> 중복을 허용한다
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    // Set -> 중복을 허용하지 않는다
    // 순서(인덱스)가 없다
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    println(numberSet)
    numberSet.forEach {
        println(it)
    }

    // Map -> Key, Value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

    //Mutable Collection (변경가능)
    val mnumberList = mutableListOf<Int>(1, 2, 3)
    mnumberList.add(3, 4)
    println()
    println(mnumberList)

    val mnumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mnumberSet.add(10)
    println(mnumberSet)

    val mnumberMap = mutableMapOf<String, Int>("one" to 1)
    mnumberMap.put("two", 2)
    println(mnumberMap)
}
