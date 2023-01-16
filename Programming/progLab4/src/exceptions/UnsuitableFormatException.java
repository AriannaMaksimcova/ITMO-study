package exceptions;

public class UnsuitableFormatException extends IllegalArgumentException{
    public UnsuitableFormatException(String massage){
        super(massage);
    }
}
