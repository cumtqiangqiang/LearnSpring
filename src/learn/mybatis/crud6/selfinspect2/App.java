package learn.mybatis.crud6.selfinspect2;


import learn.mybatis.crud6.selfinspect2.beans.NewsLabel;
import learn.mybatis.crud6.selfinspect2.dao.INewsLabelDao;
import learn.mybatis.crud6.selfinspect2.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


/**
 * Created by fiona on 2020/4/5.
 */
public class App {

    private INewsLabelDao newsLabelDao;
    private SqlSession sqlSession;
    @Before
    public void before(){
        sqlSession = MybatisUtils.getSqlSession();
        newsLabelDao = sqlSession.getMapper(INewsLabelDao.class);


    }

    @After
    public void after(){
        if (sqlSession!= null){
            sqlSession.close();
        }
    }


    @Test
    public void test1(){

         NewsLabel label =   newsLabelDao.selectChildById(2);
        System.out.println(label);

    }




}
