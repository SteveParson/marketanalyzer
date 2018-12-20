/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.steveparson.marketanalyzer;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author steve
 */
public class Controller extends JFrame {

    public Controller() {
        setTitle("Market Analyzer");
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new JLabel("test 1 2 3 4 5 "), BorderLayout.SOUTH);
        this.pack();
     
    }
    
}
