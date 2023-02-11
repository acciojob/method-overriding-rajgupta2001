package com.driver;

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    @Override
    public String meth(){
        return "Method is overridden in Extended class B";
    }
}
public class Main {
    public static void main(String[] args) {
        B b=new B();
        b.meth();

        B b1=new B();
        b1.meth();
    }
}

