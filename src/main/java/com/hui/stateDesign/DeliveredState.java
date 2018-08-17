package com.hui.stateDesign;

public class DeliveredState implements PackageState {

    public void prev(Package pkg) {
        pkg.setState(new OrderState());
    }

    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    public void statePrint() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
