import kotlin.math.sqrt

fun main(args: Array<String>) {
    printStar(5)
    print(sqrt(5.0))

}
// fun 固定写法   printStar 函数名  count 参数
// Short 参数类型 Boolean返回值类型
fun printStar(count:Short):Boolean{
    var num=0
    while (num<count){
        print('*')
        num++
    }
    println()
    return true
}
