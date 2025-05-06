package com.java.designpattern.AbstractFactoryDesignPattern;

public class ProfessionAbstractFactory extends AbstractFactory {
    @Override
    public Profession getProfession(String typeofProfession) {
        if (typeofProfession == null)
            return null;

        if (typeofProfession.equalsIgnoreCase("Engineer"))
            return new Engineer();

        if (typeofProfession.equalsIgnoreCase("Teacher"))
            return new Teacher();

        return null;
    }
}
