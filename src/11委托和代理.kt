
interface IWashBow{
    fun washing()
}


//由object申明的类会在内存中直接生成 有且只有一个 不需要实例化
//object BigHeadSon:IWashBow{
//    override fun washing() {
//        println("大头儿子洗碗")
//    }
//}


class BigHeadSon:IWashBow{
    override fun washing() {
        println("大头儿子洗碗")
    }
}

// 委托：重写的函数由其他类来完成   可以重写函数或者调用被委托类的函数
class SmallHeadDad:IWashBow by BigHeadSon(){
//    如果不重写函数 则抽象函数由被委托类来重写

    override fun washing() {
        println("我是小头爸爸")
        BigHeadSon().washing()
        println("委托给大头儿子完成任务")
    }
}

fun main(args: Array<String>) {
    val son=SmallHeadDad()
    son.washing()
}