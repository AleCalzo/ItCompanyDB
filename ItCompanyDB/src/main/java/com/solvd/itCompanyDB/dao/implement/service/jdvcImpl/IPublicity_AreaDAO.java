package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Publicity_Area;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface IPublicity_AreaDAO extends IGeneralDAO<Publicity_Area,Long> {

    Publicity_Area getPublicity_Area (Long id);
}
