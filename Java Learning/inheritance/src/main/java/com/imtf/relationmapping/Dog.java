package com.imtf.relationmapping;

class Animal {
    void eat() {
        System.out.println("eat");
    }
}
class Cat extends Animal {
    void eat(){
        System.out.println("cat small");
    }
}
public class Dog extends Cat {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
    }
}
