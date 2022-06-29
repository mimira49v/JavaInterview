package TasksFromAshgar.ExceptionsHw;

public class CheckUserName extends RuntimeException {
    CheckUserName(String message){
        super(message);
    }
}
