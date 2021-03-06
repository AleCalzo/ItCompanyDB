package com.solvd.itCompanyDB.util;

import java.sql.Connection;

public interface IConnectionPool {

    Connection getConnection();

    boolean releaseConnection(Connection connection);
}
