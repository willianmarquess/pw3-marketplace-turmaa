/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author willi
 */
public class ConnectionFactory{
    
    public static Connection getConnection() throws Exception{
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto-marketplace-turmaa", "postgres", "123456");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
