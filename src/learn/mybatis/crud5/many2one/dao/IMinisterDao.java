package learn.mybatis.crud5.many2one.dao;

import learn.mybatis.crud5.many2one.beans.Minister;

public interface IMinisterDao {
    Minister selectMinisterByid(int cid);
}
