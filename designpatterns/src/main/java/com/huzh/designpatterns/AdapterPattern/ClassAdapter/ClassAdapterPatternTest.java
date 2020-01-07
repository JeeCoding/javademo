package com.huzh.designpatterns.AdapterPattern.ClassAdapter;

public class ClassAdapterPatternTest {
    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter();
        adapter.output5V();
    }
}
