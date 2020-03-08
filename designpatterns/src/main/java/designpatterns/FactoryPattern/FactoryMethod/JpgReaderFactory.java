package designpatterns.FactoryPattern.FactoryMethod;

/**
 * Jpg加载器工厂
 */
public class JpgReaderFactory implements ReaderFactory {
    public Reader getReader() {
        return new JpgReader();
    }
}
