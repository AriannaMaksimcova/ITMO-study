package interfaces;

import characters.Person;
import characters.Showman;

public interface TVStudioBoss {
    abstract void assignSalary(Showman whom, double amount);
    void agreeWithConditions(Person character);
}
