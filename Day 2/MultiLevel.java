package com.vikku;

class Animal{ 
    ☐ void eat() { 
        System.out.println("Animal can eat");
    }
}

class Cat extends Animal{ 
    public void Meow() { 
        System.out.println("Meoooowwwww");
    }
}

class Kitten extends Cat{ 
    public void jump() { 
        System.out.println("Meeeeeeeee");
    }
}

public class Multilevel_Inheritance{ 
    ■ public static void main(String[] args) { 
        Kitten k = new Kitten();
        k.eat();
        k.Meow();
        k.jump();

    }
}