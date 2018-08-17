package com.hui.stateDesign;

public class OrderState implements PackageState {
    public void prev(Package pkg) {
        System.out.println("The package is in its root state.");
    }

    public void next(Package pkg) {
        pkg.setState(new DeliveredState());

    }

    public void statePrint() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
