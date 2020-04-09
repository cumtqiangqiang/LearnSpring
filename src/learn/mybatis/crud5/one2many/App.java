package learn.mybatis.crud5.one2many;


import learn.mybatis.crud5.one2many.beans.Country;
import learn.mybatis.crud5.one2many.dao.ICountryDao;
import learn.mybatis.crud5.one2many.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by fiona on 2020/4/5.
 */
public class App {

    private ICountryDao countryDao;
    private SqlSession sqlSession;
    @Before
    public void before(){
        sqlSession = MybatisUtils.getSqlSession();
        countryDao = sqlSession.getMapper(ICountryDao.class);


    }

    @After
    public void after(){
        if (sqlSession!= null){
            sqlSession.close();
        }
    }


    @Test
    public void test1(){

        Country country =   countryDao.selectCountryById(1);
        System.out.println(country);


    }




}
