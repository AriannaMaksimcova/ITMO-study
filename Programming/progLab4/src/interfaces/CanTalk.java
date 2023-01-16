package interfaces;

import characters.Person;

public interface CanTalk {
    void toSay(String string);
    void toAsk(String what, Person who);
}
