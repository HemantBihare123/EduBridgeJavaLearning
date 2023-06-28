package com.learning.Static;

public class MyClass {
    private static int count = 0; // static variable
    private int id;

    public MyClass() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public  int getCount() {
        return count;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        System.out.println("Obj1 ID: " + obj1.getId());
        System.out.println("Obj2 ID: " + obj2.getId());
        System.out.println("Obj3 ID: " + obj3.getId());
        System.out.println("Total Count: " + obj3.getCount());
    }
}
