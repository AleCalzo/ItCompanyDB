package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.RRHH_Area;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface IRRHH_AreaDAO extends IGeneralDAO<RRHH_Area, Long> {

    RRHH_Area getRRHH_Area (Long id);

}
