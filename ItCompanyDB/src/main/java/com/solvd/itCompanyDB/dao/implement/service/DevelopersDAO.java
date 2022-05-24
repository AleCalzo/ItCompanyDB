package com.solvd.itCompanyDB.dao.implement.service;

import com.solvd.itCompanyDB.bin.Developers_Area;
import com.solvd.itCompanyDB.dao.implement.service.jdvcImpl.IDevelopers_AreaDAO;
import com.solvd.itCompanyDB.util.DaoException;

import java.sql.Connection;
import java.util.List;

public class DevelopersDAO implements IDevelopers_AreaDAO {


    private Connection connection;

    final String INSERT = "INSERT INTO Developers_Area (id, name) VALUES (?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE Developers_Area SET name= ? WHERE id=?";
    final String DELETE = "DELETE from Developers_Area WHERE id=?";
    final String GETONE = "SELECT id, name FROM Developers_Area WHERE id=?";
    final String GETALL = "SELECT id, name FROM Developers_Area";

    @Override
    public Developers_Area getEntityId(int id) throws DaoException {
        return null;
    }

    @Override
    public void saveEntity(Developers_Area entity) throws DaoException {

    }

    @Override
    public void updateEntity(Developers_Area entity) throws DaoException {

    }

    @Override
    public void removeEntity(int id) throws DaoException {

    }

    @Override
    public List<Developers_Area> getAll() throws DaoException {
        return null;
    }

    @Override
    public Developers_Area getDvelopers_Area(Long id) {
        return null;
    }

    @Override
    public void save(Developers_Area developer) {

    }

    @Override
    public Developers_Area findById(int id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public void remove(Developers_Area developer) {

    }

    @Override
    public void setLanguage(Developers_Area developer, int languageId) {

    }

    @Override
    public void setLevel(Developers_Area developer, int levelId) {

    }
}
