package com.aqib.jpaexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
        EntityManager em= emf.createEntityManager();
        student student=new student();
        student.setS_id(27798);
        student.setS_age(11);
        student.setS_class("mcs");
        student.setS_email("ali@gmail.com");
        student.setS_favourite_subject("Java");
        student.setS_gender("Male");
        student.setS_name("ali");
        em.getTransaction().begin();
        
//        em.persist(student);
//        em.getTransaction().commit();
        student b= em.find(student.class, 21);
        System.out.println(b.toString());
        List<student> l= em.createQuery("SELECT s FROM student s").getResultList();
        viewStudent v=new viewStudent(l);
        
    }
}
