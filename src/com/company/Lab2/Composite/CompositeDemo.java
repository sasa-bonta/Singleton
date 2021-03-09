package com.company.Lab2.Composite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Thread.sleep;

public class CompositeDemo {
    public static void main(String[] args){
        // stergem toate datele din fisier
        String file = "D:/TMPS/singleton/src/com/company/Lab2/Composite/Data.txt";
        try {
            Files.write(Paths.get(file), "".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // initializam cutii cu produse (arborele)
        Box root = initialize();
        int[] levels = new int[args.length];
        for (int i=0; i < args.length; i++) {
            levels[i] = Integer.parseInt(args[i]);
        }
        root.traverse( levels );

        // sleep 2 sec
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // definim file reader
        FileReader in= null;
        try {
            in = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // citim cifrele si calculam suma
        BufferedReader br=new BufferedReader(in);
        String i="";
        int sum=0;
        while (true)
        {
            try {
                if (!((i=br.readLine())!= null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            sum += Integer.parseInt(i);
        }
        System.out.println("# Suma: " + sum);
    }

    private static Box initialize() {
        Box[] nodes = new Box[7];
        nodes[1] = new Box( 1 );
        int[] waves = {1, 4, 7};
        for (int i=0; i < 3; i++) {
            nodes[2] = new Box(21+i);
            nodes[1].add(nodes[2]);
            int level = 3;
            for (int j=0; j < 4; j++) {
                nodes[level-1].add( new Product(level*10 + waves[i]));
                nodes[level] = new Box(level*10 + waves[i]+1);
                nodes[level-1].add(nodes[level]);
                nodes[level-1].add(new Product(level*10 + waves[i]+2));
                level++;
            }
        }
        return nodes[1];
    }
}