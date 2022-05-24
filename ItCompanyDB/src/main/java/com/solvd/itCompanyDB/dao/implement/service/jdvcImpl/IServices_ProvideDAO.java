package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Services_Provide;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface IServices_ProvideDAO extends IGeneralDAO<Services_Provide, Long> {
    Services_Provide getServices_provide (Long id);
}
