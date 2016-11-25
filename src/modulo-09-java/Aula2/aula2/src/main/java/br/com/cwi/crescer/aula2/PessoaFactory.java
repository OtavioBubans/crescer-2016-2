/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author otavio.bubans
 */
public class PessoaFactory {
    
    final String query = "SELECT 1 FROM PESSOA";
        try (final Statement statement = connection.createStatement()){
            try (final ResultSet resultSet = statement.executeQuery(query)) {
              //..
            } catch (final SQLException e) {
                System.err.format("SQLException: %s", e);
         }
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
        
    public void insert (){
    final String insert = "INSERT INTO PESSOA("
                  + "ID_PESSOA, NM_PESSOA ) "
                  + "VALUES (?, ?)";
    try (final PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
    for (int i = 1; i <= 10; i++) {
    preparedStatement.setInt(1, i);
    preparedStatement.setString(2, String.format("%s pessoa de 10", i));
    preparedStatement.executeUpdate();
  }
} catch (final SQLException e) {
  System.err.format("SQLException: %s", e);
}
        
        
        }
    
}
