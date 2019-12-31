package com.huzh.designpatterns.FactoryPattern.FactoryMethod;

/**
 * Gif加载器工厂
 */
public class GifReaderFactory implements ReaderFactory {
    public Reader getReader() {
        return new GifReader();
    }
}
