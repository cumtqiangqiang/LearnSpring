package learn.mybatis.crud5.many2one2;


import learn.mybatis.crud5.many2one2.beans.Minister;
import learn.mybatis.crud5.many2one2.dao.IMinisterDao;
import learn.mybatis.crud5.many2one2.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by fiona on 2020/4/5.
 */
public class App {

    private IMinisterDao ministerDao;
    private SqlSession sqlSession;
    @Before
    public void before(){
        sqlSession = MybatisUtils.getSqlSession();
        ministerDao = sqlSession.getMapper(IMinisterDao.class);


    }

    @After
    public void after(){
        if (sqlSession!= null){
            sqlSession.close();
        }
    }


    @Test
    public void test1(){

        Minister minister =   ministerDao.selectMinisterByid(1);
        System.out.println(minister);


    }




}
