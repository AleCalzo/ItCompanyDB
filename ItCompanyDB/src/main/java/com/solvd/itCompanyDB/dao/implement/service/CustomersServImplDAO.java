package com.solvd.itCompanyDB.dao.implement.service;

import com.solvd.itCompanyDB.bin.Customers;
import com.solvd.itCompanyDB.dao.implement.service.jdvcImpl.ICustomersServices;

import com.solvd.itCompanyDB.util.DaoException;

import java.sql.Connection;
import java.util.List;


public class CustomersServImplDAO implements ICustomersServices {

    private Connection connection;

    final String INSERT = "INSERT INTO Customers (id, name, last_name, email,) VALUES (?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE Customers SET name= ?, last_name= ?, email= ?, WHERE id=?";
    final String DELETE = "DELETE from Customers WHERE id=?";
    final String GETONE = "SELECT id, name, last_name, email FROM Customers WHERE id=?";
    final String GETALL = "SELECT id, name, last_name, email FROM Customers";


    public CustomersServImplDAO (Connection connection) {
        this.connection = connection;
    }


    @Override
    public Object getEntityId(int id) throws DaoException {
        return null;
    }

    @Override
    public void saveEntity(Object entity) throws DaoException {

    }

    @Override
    public void updateEntity(Object entity) throws DaoException {

    }

    @Override
    public void removeEntity(int id) throws DaoException {

    }

    @Override
    public List getAll() throws DaoException {
        return null;
    }
}
