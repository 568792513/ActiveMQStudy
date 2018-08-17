package com.hui.stateDesign;

public class test {
    public static void main(String[] args) {
        Package pack = new Package();
        pack.printStatus();
        pack.previousState();
        pack.nextState();
        pack.printStatus();
        pack.previousState();
        pack.printStatus();

    }
}
