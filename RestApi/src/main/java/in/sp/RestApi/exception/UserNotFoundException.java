package in.sp.RestApi.exception;

public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(String ms){
        super(ms);
    }
}
