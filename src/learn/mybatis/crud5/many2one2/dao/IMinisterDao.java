package learn.mybatis.crud5.many2one2.dao;

import learn.mybatis.crud5.many2one2.beans.Minister;

public interface IMinisterDao {
    Minister selectMinisterByid(int cid);
}
