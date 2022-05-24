package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Employees;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface IEmployeesDAO extends IGeneralDAO<Employees, Long> {

    Employees getEmployees (Long id);
}
