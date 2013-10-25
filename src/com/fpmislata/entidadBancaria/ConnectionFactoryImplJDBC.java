/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.entidadBancaria;

import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author alumno
 */
public class ConnectionFactoryImplJDBC implements ConnectionFactory {

    public Connection connection() {
        return null;
    }
    
    
    @Override
    public Connection getConnection() throws Exception {
        InitialContext initCtx = new InitialContext();;
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource ds = (DataSource)envCtx.lookup("jdbc/banco");
        
        DataSource dataSource = null;
        Connection connection = dataSource.getConnection();
        
        connection.close();
        
        return null;
    }
    
}
