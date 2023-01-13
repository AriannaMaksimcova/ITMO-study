package electronics;

import characters.Person;

public class Phone extends Electronic {
    public Phone(){
        super("Телефон");
    }
    public void makeCall(Person character){
        if (isTurnedOn()){
            System.out.println("The call is made to the " + character.toString());
        }
    }

}
