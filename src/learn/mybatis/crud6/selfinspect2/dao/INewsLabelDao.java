package learn.mybatis.crud6.selfinspect2.dao;

import learn.mybatis.crud6.selfinspect2.beans.NewsLabel;

import java.util.List;


public interface INewsLabelDao {
    NewsLabel selectChildById(int id);
}
