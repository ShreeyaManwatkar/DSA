package com.vikku;

class Daddy {
    public void bike() { System.out.println("Ninja H2R");
    }
    public void car() {
        System.out.println("BMW M5");
    }
}

class son_1 extends Daddy{ 
    public void cycle() { 
        System.out.println("BMX");
    }
}

class son_2 extends Daddy{ 
    public void skateboard() { 
        System.out.println("Yonex");
    }
}

public class Dad{ 
    public static void main(String[] args) {
        son_1 obj1= new son_1(); 
        obj1.bike(); 
        obj1.car(); 
        obj1.cycle();
    }
}