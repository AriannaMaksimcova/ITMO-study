package exceptions;

public class UnsuitableFormat extends IllegalArgumentException{
    public UnsuitableFormat(String massage){
        super(massage);
    }
}
