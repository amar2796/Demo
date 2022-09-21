package Day2;
//wap to ask name ,age and salary of an employee from user 
import java.util.Scanner;
 
 
public class UserInput {

	public static void main(String[] args) {
  
		Scanner s= new Scanner(System.in); //predefined classes
		String name;
		int    age;
		Float  salary;
		
		
		System.out.println("enter name age and salary");
		name= s.nextLine();// accept spaces 
       //name= s.next() //not accept spaces 
		age=  s.nextInt();
		salary=s.nextFloat();
		System.out.println("name="+  name );
		System.out.println("age"  + age);
		System.out.println("salary="+ salary);
  
		
	}

}
