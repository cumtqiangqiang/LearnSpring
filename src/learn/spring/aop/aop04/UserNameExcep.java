package learn.spring.aop.aop04;

/**
 * Created by fiona on 2020/3/27.
 */
public class UserNameExcep extends UserException {
    public UserNameExcep() {
    }

    public UserNameExcep(String message) {
        super(message);
    }
}
