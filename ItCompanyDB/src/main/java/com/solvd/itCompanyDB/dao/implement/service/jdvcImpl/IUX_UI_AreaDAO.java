package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.UX_UI_Area;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface IUX_UI_AreaDAO extends IGeneralDAO<UX_UI_Area, Long> {

    UX_UI_Area getUX_UI_Area (Long id);
}
