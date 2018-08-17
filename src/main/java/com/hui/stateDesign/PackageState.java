package com.hui.stateDesign;

public interface PackageState {
    void prev(Package pkg);

    void next(Package pkg);

    void statePrint();
}
