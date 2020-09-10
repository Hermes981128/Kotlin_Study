import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main(args: Array<String>) {
//    内存中创建一个长宽为100的图片
    var img=BufferedImage(100,100,BufferedImage.TYPE_INT_RGB)
    img.setRGB(0,0,0xff0000)
    for (x in 0..99){    img.setRGB(x,0,0xff0000)
    }
    ImageIO.write(img,"bmp", File("test.bmp"))
}