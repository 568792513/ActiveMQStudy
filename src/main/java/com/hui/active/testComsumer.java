package com.hui.active;

public class testComsumer {
    public static void main(String[] args) {
        Comsumer comsumer = new Comsumer();
        comsumer.init();
        while (true) {
            comsumer.receiveMessage("test");
        }
    }
}
