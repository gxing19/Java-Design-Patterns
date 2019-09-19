package com.designpatterns.creational.abstractfactory.product;

/**
 * 具体产品
 * 高配
 */
public class BYDBus implements IBus {

    @Override
    public void show() {
        System.out.println("this is a byd bus");
    }
}
