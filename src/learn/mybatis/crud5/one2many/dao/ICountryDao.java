package learn.mybatis.crud5.one2many.dao;

import learn.mybatis.crud5.one2many.beans.Country;

public interface ICountryDao {
    Country selectCountryById(int cid);
}
