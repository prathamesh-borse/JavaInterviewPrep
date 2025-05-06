package com.java.designpattern.factoryDesignPattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();

        Profession engineer = professionFactory.getProfession("Engineer");
        engineer.print();

        Profession doctor = professionFactory.getProfession("Doctor");
        doctor.print();

        Profession teacher = professionFactory.getProfession("Teacher");
        teacher.print();

    }
}
