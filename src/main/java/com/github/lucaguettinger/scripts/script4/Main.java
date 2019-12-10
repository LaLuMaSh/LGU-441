package com.github.lucaguettinger.scripts.script4;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        list.remove("3");
        list.remove("2");
        list.remove("1");
        System.out.println(list);


    }
}
