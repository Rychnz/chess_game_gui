/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.gui;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Laz Bratton
 */
public class HighScore extends javax.swing.JFrame {
    /**
     * Creates new form HighScoreFrame
     */
    public HighScore() {
//        Vector<Object> columnNames = new Vector<Object>();
//        Vector<Object> data = new Vector<Object>();
//        
//        try {            
//            Connection con = DriverManager.getConnection
//                        ("jdbc:derby://localhost:1527/ChessGame");
//                Statement stmt = con.createStatement();
//                ResultSet rs = stmt.executeQuery("SELECT * FROM PLAYER WHERE");
//                ResultSetMetaData md = rs.getMetaData();
//                int columns = md.getColumnCount();
//                
//                for(int i = 1; i<=columns; i++)
//                    columnNames.addElement(md.getColumnName(i));
//                while(rs.next()) {
//                    Vector<Object> row = new Vector<Object>(columns);
//                    for(int i = 1; i <= columns; i++) 
//                        row.addElement(rs.getObject(i));
//                    data.addElement(row);
//                }
//                rs.close();
//                stmt.close();
//                con.close();
//        }
//        catch(SQLException e) {
//        
//        }
//        
//        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
//            @Override
//            public Class getColumnClass(int column) {
//                for(int row = 0; row<getRowCount();row++) {
//                    Object o = getValueAt(row, column);
//                    if(o != null) {
//                        return o.getClass();
//                    }
//                }
//                return Object.class;
//            }
//            
//        };
//        
//        JTable table = new JTable(model);
//        JScrollPane scrollPane = new JScrollPane(table);
//        getContentPane().add(scrollPane);
//        
//        JPanel buttonPanel = new JPanel();
//        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
          
       String[] columnNames = {"First Name",
                        "Last Name",
                        "Sport",
                        "# of Years",
                        "Vegetarian"};
        Object[][] data = {
    {"Kathy", "Smith",
     "Snowboarding", new Integer(5), new Boolean(false)},
    {"John", "Doe",
     "Rowing", new Integer(3), new Boolean(true)},
    {"Sue", "Black",
     "Knitting", new Integer(2), new Boolean(false)},
    {"Jane", "White",
     "Speed reading", new Integer(20), new Boolean(true)},
    {"Joe", "Brown",
     "Pool", new Integer(10), new Boolean(false)}
    };
        JTable table = new JTable(data, columnNames);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       HighScore frame = new HighScore();
       JScrollPane scrollPane = new JScrollPane(frame);
       frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frame.pack();
       frame.setVisible(true);
    }
}