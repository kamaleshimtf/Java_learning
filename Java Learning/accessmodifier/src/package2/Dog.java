package package2;

import package1.Animal;

public class Dog extends Animal {
    public static void main(String[] args) {

        System.out.println("------previous without method-------");
        int a = 10;
        int b = 10;
        int total = a + b;
        System.out.println(total);
        Animal ani = new Animal();
        System.out.println("------previous method using java method-------");
        calculator cal = new calculator();
        System.out.println(cal.addingCalculate(10,10));
    }
}
