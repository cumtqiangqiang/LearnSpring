package learn.mybatis.crud6.selfinspect3.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by fiona on 2020/4/6.
 */
public class MybatisUtils {
    private static SqlSessionFactory factory;
    public  static SqlSession getSqlSession(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("learn/mybatis/crud6/selfinspect3/mybatis.xml");
            if (factory == null){
                factory = new SqlSessionFactoryBuilder().build(inputStream);
            }

            return factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;


    }
}
