package com.hibernatedemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

   SessionFactory factory= new Configuration()
		   .configure("hibernate.cfg.xml")
		   .addAnnotatedClass(City.class)
		   .buildSessionFactory();
		
		

   // unit of work
   Session session=factory.getCurrentSession();
   
   try {
	   session.beginTransaction();
	   //HQL-->HÝBERNATE QUERY LANGUAGE
	   //select *from city 
	   //from City c where c.countryCode='TUR' AND c.district='Ankara'
	   //from City c where c.name LIKE '%kar%'
	   //ASC- Ascending
	   //DESC-Descending
		/*
		 * List<City>
		 * cities=session.createQuery("from City c ORDER BY c.name ASC").getResultList()
		 * ;
		 * 
		 * for(City city:cities) {
		 * 
		 * System.out.println(city.getName()); }
		 */
	   
	   //ýnsert
//	   City city =new City();
//	   city.setName("Düzce 10");
//	   city.setCountryCode("TUR");
//	   city.setDistrict("Karadeniz");
//	   city.setPopulation(100000);
//	   session.save(city);
	   
	      //update
	 // City city= session.get(City.class, 4086);
      // city.setPopulation(110000);
      // session.save(city);
	   
	   //delete
	   City city=session.get(City.class,4084);
	   session.delete(city);
	   
	   session.getTransaction().commit(); 
	   System.out.println("þehir guncellendi ");
   }finally { 
	factory.close(); 
}
   
   
   
}}
