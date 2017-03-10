import java.io.*;
import java.util.*;
public class contact {
	int sno;
	static Scanner s=new Scanner(System.in);
	 static String name,number;
	public static void add()
	{
		try
		{
		System.out.println("Enter name and number ");
		name=s.nextLine();
		number=s.nextLine();
		FileOutputStream f=new FileOutputStream("abc.txt",true);
		byte b[]=name.getBytes();
		byte b1[]=number.getBytes();
		byte b2[]="||".getBytes();
		f.write(b);
		f.write(b1);
		f.write(b2);
		f.close();
		System.out.println("Successfully added");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void delete()
	{
		
	}
	public static void modify()
	{
		System.out.println("\n Enter name to be modified");
		String name=s.nextLine();
		try
		{
		FileInputStream f=new FileInputStream("abc.txt");
		int i=0;
		while((i=f.read())!=-1)
		{
		
		if(name.getBytes().equals(f.read(name.getBytes())));
		{
			System.out.println("Enter name and number to be modified");
			name=s.nextLine();
			number=s.nextLine();
			FileOutputStream f1=new FileOutputStream("abc.txt");
			{
				f1.write(name.getBytes());
				f1.write(number.getBytes());
				f1.write(" ".getBytes());
			}
			f1.close();
		}
		}
		f.close();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		System.out.println("\n Choose your option");
		System.out.println("1. Add a contact");
		System.out.println("2. Delete Entry");
		System.out.println("3. Modify a contact");
		System.out.println("4. Exit");
		Scanner s=new Scanner(System.in);
		int n;
		do
		{
		n=s.nextInt();
		switch(n)
		{
		case 1: add();break;
		case 2: delete();break;
		case 3: modify();break;
		case 4: System.exit(1);break;
		default: System.out.println("Invalid Input");break;
		}
		
		System.out.println("Do you want to continue:y/n");
		ch=s.next();
		}while(ch.equals("y") || ch.equals("Y"));

	}

}
