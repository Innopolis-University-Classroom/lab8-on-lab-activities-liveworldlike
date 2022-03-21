package com.muwaffaq.innopolis.solid.LSP_IS.wrong;


public class Penguin implements Bird, Waterfown {
    /// ❌ ❌ ❌ ❌ violate Liskov Principle
    /// Penguin can't Fly

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void hatch() {
        System.out.println("laying eggs");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }


}
