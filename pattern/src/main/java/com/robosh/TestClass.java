package com.robosh;


public class TestClass {

    public static void main(String[] args) {
        new B();
    }
}

class A{

    {
        System.out.println("non-static block A");
    }

    static {
        System.out.println("static A");
    }

    A(){
        System.out.println("Constructor A");
    }
}


class B extends A{

    static {
        System.out.println("static block B");
    }

    B(){
        System.out.println("Constructor B");
    }

    {
        System.out.println("non-static B");
    }
}
