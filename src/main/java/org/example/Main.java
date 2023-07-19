package org.example;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mark");
        names.add("Paul");
        //Using Loop
        System.out.println("Using for loop");

        for(int k = 0; k<names.size(); k++){
            System.out.println("Name:" + names.get(k));
        }
        //Using Iterator method

        System.out.println("Using iterator method");
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            System.out.println("Name:" + iterator.next());
        }
    }
}