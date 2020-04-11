package learn.mybatis.crud6.selfinspect1;


import learn.mybatis.crud6.selfinspect1.beans.NewsLabel;
import learn.mybatis.crud6.selfinspect1.dao.INewsLabelDao;
import learn.mybatis.crud6.selfinspect1.utils.MybatisUtils;
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

         List<NewsLabel> list =   newsLabelDao.selectChildByParent(2);
        for (NewsLabel label: list) {
            System.out.println(label);
        }

    }




}
