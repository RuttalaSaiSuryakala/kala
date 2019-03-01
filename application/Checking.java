package application;

import java.io.IOException;
import java.util.Scanner;

public class Checking {
public static void main(String args[]) throws IOException, ClassNotFoundException
{
	String choice;
	Scanner s= new Scanner(System.in);
	System.out.println("enter either registration or login");
	choice=s.next();
	switch(choice)
	{
	case "registration" :Registration reg=new Registration();
							reg.get();
							reg.serialize();
							Login l=new Login();
							//l.check();
	case "login" :Login login1= new Login();
							login1.check();
							login1.unserialize();
	}
	
}
}
