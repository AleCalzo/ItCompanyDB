package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Bills;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface IBillsDAO extends IGeneralDAO<Bills, Long> {

    Bills getBills (Long id);
}
