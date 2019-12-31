package com.huzh.designpatterns.FactoryPattern.FactoryMethod;

public class Client {

    public static void main(String[] args) {
        ReaderFactory jpgFactory = new JpgReaderFactory();
        Reader jpgReader = jpgFactory.getReader();
        jpgReader.read();

        ReaderFactory pngFactory = new PngReaderFactory();
        Reader pngReader = pngFactory.getReader();
        pngReader.read();

        ReaderFactory gifFactory = new GifReaderFactory();
        Reader gifReader = gifFactory.getReader();
        gifReader.read();
    }
}
