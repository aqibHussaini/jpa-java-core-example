/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aqib.jpaexample;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhatti
 */
public class viewStudent extends JFrame  {
	 public static void main( String[] args )
	    {
		 JOptionPane.showMessageDialog(null, "hi");
		 try {
			 EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		        EntityManager em= emf.createEntityManager();
		        List<student> l= em.createQuery("SELECT s FROM student s").getResultList();
		        viewStudent v=new viewStudent(l);
		        JOptionPane.showMessageDialog(null, "hi");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "hi"+e.getMessage());
		}
		 
		    
	    }
    JButton back;
    JTable table;
    DefaultTableModel dtm;
    List<student> studentlist;
    
    public viewStudent(List<student> studentlist) throws HeadlessException {
		super();
		this.studentlist = studentlist;
	}

	public viewStudent()throws Exception{
		System.out.print("hi");
		 JOptionPane.showMessageDialog(null, "hi");
        this.setBounds(0, 0, 900, 600);
        this.setDefaultCloseOperation(3);
        this.setLayout(new BorderLayout());
         back =new JButton("Back");
        back.setFont(new Font("lato", Font.BOLD, 30));
        back.setBounds(100, 480, 200, 70);
        back.setBackground(new Color(252, 65, 54));
        back.setForeground(Color.white);
        
        String t_head[] = {"Id", "name", "Subject", "email" };
        dtm = new DefaultTableModel(t_head, 0);
        
        List<student> studentlist=this.studentlist;
        for(student o:studentlist)
        {
            String data[]={""+o.getS_id(),o.getS_name(),o.getS_favourite_subject(),o.getS_email()};
            dtm.addRow(data);
        }
        table = new JTable(dtm);
        // setting table header decoration
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(32, 136, 203));
        table.getTableHeader().setForeground(new Color(255, 255, 255));
        table.setRowHeight(30);
        // table body decoration
        table.setRowHeight(35);
        table.getTableHeader().setFont(new Font("Segoe", Font.BOLD, 14));
        table.setFont(new Font("poppins", Font.BOLD, 14));
        JScrollPane jsp = new JScrollPane(table);
        this.add(jsp, BorderLayout.CENTER);
        this.add(back, BorderLayout.SOUTH);
        this.setVisible(true);
      JOptionPane.showConfirmDialog(null, "cala");
    }

  

    
}