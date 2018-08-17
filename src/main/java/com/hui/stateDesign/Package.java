package com.hui.stateDesign;

public class Package {

    private PackageState packageState = new OrderState();

    public void previousState() {
        packageState.prev(this);
    }

    public void nextState() {
        packageState.next(this);
    }

    public void printStatus() {
        packageState.statePrint();
    }

    public void setState(PackageState pkg) {
        this.packageState = pkg;
    }
}
