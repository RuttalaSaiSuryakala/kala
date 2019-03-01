package application;
import application.Registration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Login  implements Serializable {
	Registration regiter1=new Registration();
	private static long accountno;
	private static String pwd;
	private static double balance=10000;
public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
public void check()
{
	Login login1=new Login();
	Scanner s= new Scanner(System.in);
	System.out.println("enter accountno");
	login1.setAccountno(s.nextLong());
	System.out.println("enter password");
	login1.setPwd(s.next());
	
}
static void unserialize() throws IOException, ClassNotFoundException
{
	Scanner s=new Scanner(System.in);
	FileInputStream file2=new FileInputStream("C:\\Users\\SAISURYAKALA\\Desktop\\customer\\details.txt");
ObjectInputStream object2= new ObjectInputStream(file2);
	ArrayList<Registration> object3=(ArrayList<Registration>)object2.readObject();
	Iterator iterate=object3.iterator();
	loop:		while(iterate.hasNext())
			{
				for(Registration get:object3)
				{
					System.out.println(get.getAddress());
					System.out.println(get.getPassword());
				if(get.getPassword().equals(pwd))
				{
					if(get.getAccountno().equals(accountno))
					{
						System.out.println("enter ur choice");
						String choice1;
						choice1=s.next();
						switch(choice1)
						{
						case "withdraw":
						Login.withdraw();
						break;
						case "deposit":
						Login.deposit();
						break;
						case "Exit":
							Login.exit();
							break;
						
						}	
					
					}
					}
				
				}
				//iterate.next();
				break;						
			}
	file2.close();
	object2.close();
	
}
 public static void withdraw() {
	 int amount;
	 System.out.println("Enter amount");
	 Scanner scan=new Scanner(System.in);
	 amount=scan.nextInt();
	 if(Login.balance<amount) {
		 System.out.println("Insufficient balance");
		// Login.deposit();
		 System.out.println(balance);
		 
	 }else {
		 balance = balance-amount;
		// Login.deposit();
	 }
 }
 public static void deposit() {
	 int amount;
	 System.out.println("Enter amount");
	 Scanner scan=new Scanner(System.in);
	 amount=scan.nextInt();
	 balance=balance+amount;
	 System.out.println(balance);
	 
	
 }
public static void exit() {
	exit();
}
}
