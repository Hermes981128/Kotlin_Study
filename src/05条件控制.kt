@file:Suppress("CAST_NEVER_SUCCEEDS")


fun main(args: Array<String>) {
//    条件控制
//    If表达式
    print("请输入0~10之间的数:")
    var input = Integer.valueOf(readLine())
    if ((input as Int) > 5) {
        println("你输入的数字大于5")
    } else {
        println("你输入的数字小于或等于5")
    }
//    When 表达式
    when (input) {
        in 1..5 -> println("在1-5之间")
        in 5..10 -> println("在5-10之间")
        else -> println("其他情况")
    }
    for (num in 0..input){
        println("这是第${num}次打印")
    }
    while (input>0){
        println("input的大小为：$input")
        input=0
    }
}

