package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.product.SeniorCar;

/**
 * 产品具体工厂
 *
 * 生产中配汽车
 */
public class SeniorCarFactory extends AbstractCarFactory {

    @Override
    public SeniorCar createCar() {
        return new SeniorCar();
    }
}
