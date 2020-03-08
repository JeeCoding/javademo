package designpatterns.FactoryPattern.FactoryMethod;

/**
 * 创建Png图片加载器类
 */
public class PngReader implements Reader {
    public void read() {
        System.out.println("read png");
    }
}
