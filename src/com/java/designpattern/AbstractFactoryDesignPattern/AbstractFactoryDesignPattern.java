package com.java.designpattern.AbstractFactoryDesignPattern;

public class AbstractFactoryDesignPattern {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Profession engineer = abstractFactory.getProfession("Engineer");
        engineer.print();

        Profession teacher = abstractFactory.getProfession("Teacher");
        teacher.print();

        AbstractFactory abstractFactory1 = AbstractFactoryProducer.getProfession(false);
        Profession engineer1 = abstractFactory1.getProfession("Engineer");
        engineer1.print();

        Profession teacher1 = abstractFactory1.getProfession("Teacher");
        teacher1.print();
    }
}
