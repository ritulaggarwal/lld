package com.systemdesign.composite.naive;

public class File {

    private final String name;

    public File(final String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("File name is : " + this.name);
    }

}
