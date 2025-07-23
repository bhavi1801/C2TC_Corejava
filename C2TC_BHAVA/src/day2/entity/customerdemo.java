package day2.entity;

public class customerdemo {
	public static void main(String[] args) {
		Customer c1= new Customer();
		
		System.out.println(c1);
	
	Customer c2= new Customer();
	c1.setCid(101);
	c1.setCname("raju");
	c1.setCity("chennai");
	System.out.println(c2);


	Customer c3= new Customer();
	c1.setCid(101);
	c1.setCname("raja");
	c1.setCity("chennai");
	System.out.println(c3);
	
	System.out.println("Customer 1+ city:" +c1.getcity()+ )





