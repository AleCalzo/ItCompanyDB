package com.solvd.itCompanyDB.dao.implement.service;
import com.solvd.itCompanyDB.util.DaoException;

import java.util.List;

public interface IGeneralDAO<K,Long>{

    K getEntityId(int id) throws DaoException;
    void saveEntity(K entity) throws DaoException;
    void updateEntity(K entity) throws DaoException;
    void removeEntity(int id) throws DaoException;
    List<K> getAll() throws DaoException;
}
