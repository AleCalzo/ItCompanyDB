package com.solvd.itCompanyDB.dao.implement.service.jdvcImpl;

import com.solvd.itCompanyDB.bin.Currents_Projects;
import com.solvd.itCompanyDB.dao.implement.service.IGeneralDAO;

public interface ICurrent_ProyectsDAO extends IGeneralDAO<Currents_Projects, Long> {
    Currents_Projects getCurrent_Proyects (Long id);
}
