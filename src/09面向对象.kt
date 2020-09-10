class GirlsClass(var height: Int,
                 var character: String,
//           私有属性 voice
                 private var voice: String) {
    fun speak() {
        println(voice)
    }

    private fun privateMethods() {
        println("只能在类内部调用")
    }
}

//继承 父类
//只有打开的类才可以被继承
open class FatherClass(
        var character: String = "",
        var age: Int = 0,
        var physical: String = ""
) {
    open fun showAge() {
        println(age)
    }

}

class SonClass : FatherClass() {
    override fun showAge() {
        super.showAge()
        println("子类的重写")
    }

}

//抽象类 抽象方法
// 多态
abstract class AnAbstractClass(var name: String) {
    abstract fun eat()
    abstract fun pee()
}


// 继承抽象类 重写抽象方法
class AnAbstractClassInstance(name: String, var age: Int) : AnAbstractClass(name) {
    override fun eat() {
        println("继承抽象父类以后重写的抽象方法")
    }

    override fun pee() {
        println("${name}站着尿尿")
    }

    fun printName() {
        println(name)
    }

    fun printAge() {
        println(age)
    }
}

// 继承抽象类 重写抽象方法
// 多态 继承同一个父类 但是重写以后的方法可以是不一样的
class AnAbstractClassInstance1(name: String, var age: Int) : AnAbstractClass(name) {
    override fun eat() {
        println("继承抽象父类以后重写的抽象方法")
    }

    override fun pee() {
        println("${name}蹲着尿尿")

    }

    fun printName() {
        println(name)
    }

    fun printAge() {
        println(age)
    }
}


fun main(args: Array<String>) {
    val girl = GirlsClass(160, "可爱", "甜美")
    girl.speak()
    girl.height = 100
    println(girl.height)
    val son = SonClass()
    son.showAge()
    val abstract = AnAbstractClassInstance("抽象名字", 18)
    abstract.eat()
    abstract.printName()
    abstract.printAge()

}