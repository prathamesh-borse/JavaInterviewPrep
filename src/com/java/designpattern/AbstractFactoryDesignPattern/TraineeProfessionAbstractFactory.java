package com.java.designpattern.AbstractFactoryDesignPattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory {
    @Override
    public Profession getProfession(String typeofProfession) {
        if (typeofProfession == null)
            return null;

        if (typeofProfession.equalsIgnoreCase("Engineer"))
            return new TraineeEngineer();

        if (typeofProfession.equalsIgnoreCase("Teacher"))
            return new TraineeTeacher();

        return null;
    }
}
