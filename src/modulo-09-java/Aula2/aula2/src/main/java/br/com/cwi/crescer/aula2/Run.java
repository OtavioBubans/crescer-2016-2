/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author otavio.bubans
 */
public class Run {
   public static void main(String [] args){
           
   try (final Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.99.2.45.:1521:xe","cwi", "cwi")) {
       
       try (final Statement statement = connection.createStatement()) {
     // ...
     } catch (final SQLException e) {
        System.err.format("SQLException: %s", e);
         }
    } catch (SQLException e) {
        System.err.format("SQLException: %s", e);
}
}
    
}
