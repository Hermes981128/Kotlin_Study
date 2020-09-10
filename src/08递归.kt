fun main() {
//    recursive(10)
    var result = factorial(10)
    println(result)

//    尾递归优化
//    堆栈溢出 当递归次数过多时会出现堆栈溢出异常
    println(ollAdd(1000000,0))
}

fun recursive(num: Int) {
    if (num > 0) {
        println("当前num值为${num}，继续递归")
        recursive(num - 1)
    } else {
        println("递归结束")
    }
}

fun factorial(num: Int): Int {
    return if (num == 1) {
        1
    } else {
        factorial(num - 1) * num
    }
}

tailrec fun ollAdd(num:Int,result:Int):Int{
    return if (num==1){result+1}else{ollAdd(num-1,result+num)}
}
