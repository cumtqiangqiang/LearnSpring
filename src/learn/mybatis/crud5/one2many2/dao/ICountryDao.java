package learn.mybatis.crud5.one2many2.dao;

import learn.mybatis.crud5.one2many2.beans.Country;

public interface ICountryDao {
    Country selectCountryById(int cid);
}
