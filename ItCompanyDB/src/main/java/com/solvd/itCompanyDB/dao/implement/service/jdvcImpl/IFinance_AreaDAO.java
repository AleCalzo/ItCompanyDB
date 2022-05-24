package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Finance_Area;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface IFinance_AreaDAO extends IGeneralDAO<Finance_Area, Long> {

    Finance_Area getFinance_Area (Long id);
}
