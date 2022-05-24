package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Suppliers;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface ISuppliersDAO extends IGeneralDAO<Suppliers, Long> {

    Suppliers getSuppliers (Long id);
}
