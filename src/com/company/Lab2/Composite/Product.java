package com.company.Lab2.Composite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class Product extends Entity {
    private int value;
    public Product(int value) {
        this.value = value;
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);

            String file = "D:/TMPS/singleton/src/com/company/Lab2/Composite/Data.txt";
            try {
                Files.write(Paths.get(file), ((indent.toString() + value).trim() + "\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
