package com.systemdesign.composite.pattern;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem {

    private final String directoryName;
    private List<IFileSystem> fileSystemList;

    public Directory(final String directoryName) {
        this.directoryName = directoryName;
        fileSystemList = new ArrayList<>();
    }

    public void add(final IFileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: " + this.directoryName);
        fileSystemList.forEach(fileSystem -> {
            fileSystem.ls();
        });

    }

}
