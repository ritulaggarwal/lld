package com.systemdesign.composite.naive;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String directoryName;
    private List<Object> objectList;

    public Directory(final String name) {
        this.directoryName = name;
        objectList = new ArrayList<>();
    }


    public void add(final Object object) {
        objectList.add(object);
    }

    public void ls() {
        System.out.println("Directory Name: " + directoryName);
        objectList.forEach(object -> {
            if(object instanceof File) {
                ((File) object).ls();
            } else if(object instanceof Directory) {
                ((Directory) object).ls();
            }
        });


    }

}
