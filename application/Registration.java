package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Registration implements Serializable{
	static ArrayList<Registration> array1=new ArrayList();
	private String firstName;
	private String lastName;
	private long mobileno;
	private String password;
	//private long accountno;
	private String address;
	private double aadharno;
	private static long accountno;
	private static double balance=0;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAadharno() {
		return aadharno;
	}
	public void setAadharno(double aadharno) {
		this.aadharno = aadharno;
	}
	public Long getAccountno()
	{
		return accountno;
	}
	public static void get() {
		Registration register=new Registration();
		Random obj=new Random();
		Scanner s= new Scanner(System.in);
		System.out.println("enter First Name");
		register.setFirstName(s.next());
		System.out.println("enter last name");
		register.setLastName(s.next());
		System.out.println("enter mobileno");
		register.setMobileno(s.nextLong());
		System.out.println("enter aadharno");
		register.setAadharno(s.nextLong());
		System.out.println("enter addreess");
		register.setAddress(s.next());
		System.out.println("enter password");
		register.setPassword(s.next());
		accountno=obj.nextLong();
		System.out.println("your account no is "+Math.abs(accountno));
		array1.add(register);
		
		
		
	}
	static void serialize() throws IOException
	{
		FileOutputStream file1=new FileOutputStream("C:\\Users\\SAISURYAKALA\\Desktop\\customer\\details.txt");
	    ObjectOutputStream object1= new ObjectOutputStream(file1);
	    object1.writeObject(array1);
	file1.close();
	object1.close();
	}

}
