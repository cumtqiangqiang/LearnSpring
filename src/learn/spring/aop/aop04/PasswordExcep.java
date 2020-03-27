package learn.spring.aop.aop04;

/**
 * Created by fiona on 2020/3/27.
 */
public class PasswordExcep extends UserException {
    public PasswordExcep() {
    }

    public PasswordExcep(String message) {
        super(message);
    }
}
