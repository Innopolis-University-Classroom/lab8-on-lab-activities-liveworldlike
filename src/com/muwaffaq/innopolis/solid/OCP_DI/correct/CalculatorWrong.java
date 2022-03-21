package com.muwaffaq.innopolis.solid.OCP_DI.wrong;

//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//
 class CalculatorWrong {
    private double left;
    private double right;

    public enum Operation {ADD, SUBTRACT, DIVIDE,MULTIPLICATION}

    public double add(){ return left + right; }
    public double substract(){ return left - right; }
    public double divide(){ return left / right; }
    public double multiply(){ return left * right; }

    public static void main(String[] args) {
        CalculatorWrong calculator = new CalculatorWrong();
        calculator.add();
        calculator.add();
    }

}


