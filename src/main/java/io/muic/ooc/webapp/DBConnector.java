package io.muic.ooc.webapp;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBConnector {

    void setDBConn(Connection connection);

    void init() throws SQLException;

}
