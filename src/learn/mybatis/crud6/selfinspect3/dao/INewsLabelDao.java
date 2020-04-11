package learn.mybatis.crud6.selfinspect3.dao;

import learn.mybatis.crud6.selfinspect3.beans.NewsLabel;


public interface INewsLabelDao {
    NewsLabel selectParentById(int id);
}
