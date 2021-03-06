package learn.mybatis.crud5.many2one;


import learn.mybatis.crud5.many2one.beans.Country;
import learn.mybatis.crud5.many2one.beans.Minister;
import learn.mybatis.crud5.many2one.dao.IMinisterDao;
import learn.mybatis.crud5.many2one.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by fiona on 2020/4/5.
 */
public class App {

    private IMinisterDao countryDao;
    private SqlSession sqlSession;
    @Before
    public void before(){
        sqlSession = MybatisUtils.getSqlSession();
        countryDao = sqlSession.getMapper(IMinisterDao.class);


    }

    @After
    public void after(){
        if (sqlSession!= null){
            sqlSession.close();
        }
    }


    @Test
    public void test1(){

        Minister minister =   countryDao.selectMinisterByid(2);
        System.out.println(minister);


    }




}
