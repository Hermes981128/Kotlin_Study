
//接口 反应的是事物的能力
interface IMan{
    fun xiaodidi()
}

class Man(var name:String):IMan{
    override fun xiaodidi() {
        println("我有一个梦想")
    }
    fun printName(){
        println(name)
    }
}

fun main(args: Array<String>) {
    val a=Man("屮")
    a.xiaodidi()
    a.printName()
}