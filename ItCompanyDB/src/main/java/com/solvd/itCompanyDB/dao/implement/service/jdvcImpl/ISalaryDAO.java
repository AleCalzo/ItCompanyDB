package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Salary;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface ISalaryDAO extends IGeneralDAO<Salary, Long> {

    Salary getSalary (Long id);
}
