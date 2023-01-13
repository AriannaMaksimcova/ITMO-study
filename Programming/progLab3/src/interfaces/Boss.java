package interfaces;

import characters.Showman;

public interface Boss {
    abstract void assignSalary(Showman whom, double amount);
    void agreeWithConditions(Showman character);
}
