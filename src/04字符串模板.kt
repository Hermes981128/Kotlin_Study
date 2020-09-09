fun main(args: Array<String>) {
    println(stringTemplate("晴天"))

}
fun stringTemplate(content:String):String{
    return """
        今天天气为：${content}
    """.trimIndent()
}