/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.gui;

import ChessGame.model.Chess;
import ChessGame.model.Player;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Laz Bratton
 */
public class PlayerSelect extends javax.swing.JFrame {
    
    String playerOneName;
    String playerTwoName;
    Player playerOne;
    Player playerTwo;
    /**
     * Creates new form PlayerSelect
     */
    public PlayerSelect() {
        this.setLocationRelativeTo(null);
        initComponents();
        fillCombo();
    }
    
    private void fillCombo() {
        jComboPlayerOne.removeAllItems();
        jComboPlayerTwo.removeAllItems();
        try{
            String sql="SELECT * FROM PLAYER";
            Connection con = DriverManager.getConnection
                        ("jdbc:derby://localhost:1527/ChessGame");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String name = rs.getString("NAME");
                jComboPlayerOne.addItem(name);
                jComboPlayerTwo.addItem(name);
            }
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerOneSelect = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboPlayerOne = new javax.swing.JComboBox();
        jComboPlayerTwo = new javax.swing.JComboBox();
        jTextPlayerOne = new javax.swing.JTextField();
        createPlayerOne = new javax.swing.JButton();
        selectPlayerOne = new javax.swing.JButton();
        selectPlayerTwo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        playerTwoSelect = new javax.swing.JPanel();
        jButtonStartGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Create new Player account or select from the dropdown menus");

        jComboPlayerOne.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboPlayerOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPlayerOneActionPerformed(evt);
            }
        });

        jComboPlayerTwo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboPlayerTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPlayerTwoActionPerformed(evt);
            }
        });

        jTextPlayerOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPlayerOneActionPerformed(evt);
            }
        });

        createPlayerOne.setText("Create");
        createPlayerOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlayerOneActionPerformed(evt);
            }
        });

        selectPlayerOne.setText("Select");
        selectPlayerOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPlayerOneActionPerformed(evt);
            }
        });

        selectPlayerTwo.setText("Select");
        selectPlayerTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPlayerTwoActionPerformed(evt);
            }
        });

        jLabel2.setText("Player One");

        jLabel3.setText("Player Two");

        javax.swing.GroupLayout playerOneSelectLayout = new javax.swing.GroupLayout(playerOneSelect);
        playerOneSelect.setLayout(playerOneSelectLayout);
        playerOneSelectLayout.setHorizontalGroup(
            playerOneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerOneSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerOneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerOneSelectLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerOneSelectLayout.createSequentialGroup()
                        .addComponent(jComboPlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboPlayerTwo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(playerOneSelectLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(selectPlayerOne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectPlayerTwo)
                .addGap(83, 83, 83))
            .addGroup(playerOneSelectLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(109, 109, 109))
            .addGroup(playerOneSelectLayout.createSequentialGroup()
                .addGroup(playerOneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerOneSelectLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(createPlayerOne))
                    .addGroup(playerOneSelectLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jTextPlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playerOneSelectLayout.setVerticalGroup(
            playerOneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerOneSelectLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextPlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(createPlayerOne)
                .addGap(48, 48, 48)
                .addGroup(playerOneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(playerOneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboPlayerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboPlayerOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(playerOneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPlayerOne)
                    .addComponent(selectPlayerTwo))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout playerTwoSelectLayout = new javax.swing.GroupLayout(playerTwoSelect);
        playerTwoSelect.setLayout(playerTwoSelectLayout);
        playerTwoSelectLayout.setHorizontalGroup(
            playerTwoSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        playerTwoSelectLayout.setVerticalGroup(
            playerTwoSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonStartGame.setText("Start Game");
        jButtonStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerOneSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jButtonStartGame)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerTwoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerTwoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(playerOneSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButtonStartGame)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboPlayerOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPlayerOneActionPerformed
        
        
    }//GEN-LAST:event_jComboPlayerOneActionPerformed

    private void selectPlayerOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPlayerOneActionPerformed
        playerOneName = (String)jComboPlayerOne.getSelectedItem();
        playerOne = new Player(playerOneName);
        selectPlayerOne.setEnabled(false);
    }//GEN-LAST:event_selectPlayerOneActionPerformed

    private void jTextPlayerOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPlayerOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPlayerOneActionPerformed

    private void createPlayerOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlayerOneActionPerformed
        String name = jTextPlayerOne.getText();
        Player newPlayer = new Player(name);
        fillCombo();
    }//GEN-LAST:event_createPlayerOneActionPerformed

    private void jComboPlayerTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPlayerTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPlayerTwoActionPerformed

    private void selectPlayerTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPlayerTwoActionPerformed
        playerTwoName = (String)jComboPlayerOne.getSelectedItem();
        playerTwo = new Player(playerTwoName);
        selectPlayerTwo.setEnabled(false);
    }//GEN-LAST:event_selectPlayerTwoActionPerformed

    private void jButtonStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartGameActionPerformed
        
        this.setVisible(false);
        Chess chess = new Chess(playerOne, playerTwo);
        new ChessBoardUI(chess).setVisible(true);
    }//GEN-LAST:event_jButtonStartGameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPlayerOne;
    private javax.swing.JButton jButtonStartGame;
    private javax.swing.JComboBox jComboPlayerOne;
    private javax.swing.JComboBox jComboPlayerTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextPlayerOne;
    private javax.swing.JPanel playerOneSelect;
    private javax.swing.JPanel playerTwoSelect;
    private javax.swing.JButton selectPlayerOne;
    private javax.swing.JButton selectPlayerTwo;
    // End of variables declaration//GEN-END:variables
}
