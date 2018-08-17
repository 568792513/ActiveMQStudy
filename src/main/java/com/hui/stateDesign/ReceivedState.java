package com.hui.stateDesign;

public class ReceivedState implements PackageState {

    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    public void statePrint() {
        System.out.println("送达了啊");
    }
}
