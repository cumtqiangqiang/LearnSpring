package learn.spring.aop.aop04;

/**
 * Created by fiona on 2020/3/11.
 */
public class SomeServiceImpl  implements ISomeService {

    SomeServiceImpl (){
        System.out.println("构造方法");
    }

    public void login(String userName, String passwd) throws UserException {
        if (! userName.equals("qiang")){
            throw   new UserNameExcep("用户名错误");
        }
        if (!passwd.equals("111")){
            throw new PasswordExcep("密码错误");
        }
    }
}
