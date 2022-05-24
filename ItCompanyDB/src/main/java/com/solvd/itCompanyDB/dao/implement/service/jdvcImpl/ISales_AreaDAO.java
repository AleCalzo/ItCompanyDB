package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Sales_Area;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface ISales_AreaDAO extends IGeneralDAO<Sales_Area, Long> {

    Sales_Area getSales_Area (Long id);
}
