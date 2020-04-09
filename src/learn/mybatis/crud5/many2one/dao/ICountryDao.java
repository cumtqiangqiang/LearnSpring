package learn.mybatis.crud5.many2one.dao;

import learn.mybatis.crud5.many2one.beans.Country;

public interface ICountryDao {
    Country selectCountryById(int cid);
}
