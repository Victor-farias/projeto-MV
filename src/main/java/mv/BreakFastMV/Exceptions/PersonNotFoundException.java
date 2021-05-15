package mv.BreakFastMV.Exceptions;

public class PersonNotFoundException extends Exception{

    public PersonNotFoundException(Long id) {

        super("Person with " + id + " not found");
    }

}
