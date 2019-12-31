package com.huzh.designpatterns.FactoryPattern.FactoryMethod;

/**
 * Png加载器工厂
 */
public class PngReaderFactory implements ReaderFactory {
    public Reader getReader() {
        return new PngReader();
    }
}
