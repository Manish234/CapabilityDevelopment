package codeexercise;

import java.util.HashSet;

public class EmptyHashSet {
    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<String>();
        hset.add("Welcome");
        hset.add("To");
        hset.add("JavaTpoint");
        System.out.println("HashSet Elements: "+hset);
        System.out.println("Is the set empty: "+hset.isEmpty());
        //Clearing the set and Check for the empty set
        hset.clear();
        System.out.println("Is the set empty: "+hset.isEmpty());
    }
}
