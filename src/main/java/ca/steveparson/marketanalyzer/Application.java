/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.steveparson.marketanalyzer;

import javax.swing.SwingUtilities;

public class Application {
	   public static void main(String[] args) {
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace(System.out);
	        }

	        SwingUtilities.invokeLater(() -> {
	                new Controller().setVisible(true);
	        });
	    }
}