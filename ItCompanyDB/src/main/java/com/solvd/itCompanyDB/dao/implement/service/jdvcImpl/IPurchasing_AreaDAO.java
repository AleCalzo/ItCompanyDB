package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Purchasing_Area;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface IPurchasing_AreaDAO extends IGeneralDAO<Purchasing_Area, Long> {

    Purchasing_Area getPurchasing_Area (Long id);
}
