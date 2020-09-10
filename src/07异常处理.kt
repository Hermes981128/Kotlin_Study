import kotlin.test.expect

fun main(args: Array<String>) {
    try {
        val a= readLine()
        a!!.toInt()
    }
    catch(e:NumberFormatException)
    {
        println(e)
    }


}