fun main(args: Array<String>) {
    val items= listOf<String>("a","b","c","d","e")
//    1.for 循环遍历
    for (item in items){
        println(item)
    }
//    2. forEach遍历 默认item为it
    items.forEach { println(it) }
}