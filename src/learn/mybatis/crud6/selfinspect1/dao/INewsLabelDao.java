package learn.mybatis.crud6.selfinspect1.dao;

import learn.mybatis.crud6.selfinspect1.beans.NewsLabel;

import java.util.List;


public interface INewsLabelDao {
    List<NewsLabel> selectChildByParent(int pid);
}
