import java.util.*;
import java.lang.*;
class Employe{
    private String name;
    private String address;
    private String mobile;
    
    String getName(){
        return name;
    }
    void setName(String temp){
        this.name = temp;
    }
    
    String getAddress(){
        return address;
    }
    void setAddress(String temp){
        this.address = temp;
    }
    
    String getMobile(){
        return mobile;
    }
    void setMobile(String temp){
        this.mobile = temp;
    }
}

public class EmployeMain
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp= new Employee();
		System.out.println("enter name");
		emp.setName(sc.nextLine());
		
		System.out.println("enter address");
		emp.setAddress(sc.nextLine());
		
		System.out.println("enter mobile");
		emp.setMobile(sc.nextLine());
		
		System.out.println("Employee Details");
		System.out.println("Name: "+emp.getName());
		System.out.println("Address: "+emp.getAddress());
		System.out.println("Mobile: "+emp.getMobile());
		//address
		//mobile
		System.out.println("Verify and Update the details:");
		int n;
		while(true){
		    System.out.println("Menu");
		    System.out.println("1. Update Employee name");
		    System.out.println("2. Update Employee Address");
		    System.out.println("3. Update Employee mobile");
		    System.out.println("4. All information correct/Exit"); 
		    //2nd option
		    //3rd
		    //4th
		    n=sc.nextInt();
		    switch(n){
		        case 1:
		            System.out.println("Current name is:"+emp.getName());
			    System.out.println("Enter the name:");
		            emp.setName(sc.next());
		            break;
		        case 2 :
		            //address code
			    System.out.println("Current address is:"+emp.getAddress());
			    System.out.println("Enter the address:");
			    String a=sc.next();
			    emp.setAddress(a);
		            break;
		        case 3 :
		            //mobile code
			    System.out.println("Current mobile is:"+emp.getMobile());
			    System.out.println("Enter the mobile:");
			    emp.setMobile(sc.next());
		            break;
		        case 4:
		            System.out.println("The details are:\n");
		            System.out.println("Name: "+emp.getName());
		            //address
			    System.out.println("Address: "+emp.getAddress());
			    System.out.println("Mobile: "+emp.getMobile());
		            //mobile
		            System.exit(0);
		    }
		}
	}
}
