/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_scheduler;

import gui_scheduler.db_connector;
import gui_scheduler.gui_scheduler;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;

/**
 *
 * @author demon
 */
public class Query {

    static Object query() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Query() throws SQLException {

        long millis = System.currentTimeMillis();
        java.sql.Date date1 = new java.sql.Date(millis);
        System.out.println(date1);

        Statement stmt = db_connector.Connect().createStatement();
        stmt.executeQuery("use calendar");
//       return stmt;
       
    }
}
