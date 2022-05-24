package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Customers;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface ICustomersDAO extends IGeneralDAO<Customers, Long> {

    Customers getCustumers (Long id);
}
