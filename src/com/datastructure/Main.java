package com.datastructure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = { 10,20,30 };
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(3);
        System.out.println(numbers.indexOf(100));
        numbers.print();

        //Vector: 100% - synchronized
        // ArrayList: 50%

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.remove(0);
//        list.indexOf(20);
//        list.contains(30);
//        list.size();
//        list.toArray();
//        System.out.println(list);

//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(5);
//        System.out.println(list.contains(10));
//        System.out.println(list.indexOf(10));
//        System.out.println(list.size());
//        var array=list.toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(list);
//
//        var list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);

    }
}
