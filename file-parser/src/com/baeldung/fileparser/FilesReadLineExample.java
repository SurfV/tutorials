package com.baeldung.fileparser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesReadLineExample {

    private static final String FILENAME = "src/resources/txt.txt";

    public static void main(String[] args) {
        try {
            System.out.println(generateArrayListFromFile(FILENAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> generateArrayListFromFile(String filename) throws IOException {
        
        List<String> result = Files.readAllLines(Paths.get(filename));
        
        return (ArrayList<String>) result;
    }

}