package interfaces;

import characters.Person;
import characters.Showman;

public interface TVStudioBossAction {
    void assignSalary(Showman whom, double amount);
    void agreeWithConditions(Person character);
}
