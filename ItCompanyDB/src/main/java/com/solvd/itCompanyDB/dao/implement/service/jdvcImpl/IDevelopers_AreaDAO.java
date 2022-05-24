package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Developers_Area;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

import java.util.List;

public interface IDevelopers_AreaDAO extends IGeneralDAO<Developers_Area, Long> {

    Developers_Area getDvelopers_Area (Long id);

    void save( Developers_Area developer);

    Developers_Area findById(int id);

    List findAll();

    void remove( Developers_Area developer);

    void setLanguage( Developers_Area developer, int languageId);

    void setLevel( Developers_Area developer, int levelId);

}
