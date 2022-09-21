/*

Q wap to ask percentage of a student if greater than 80 then ask for maths percentage if its greater then 80 then print eligible for admission
*/
import java.util.Scanner;
class eligibility
{

public static void main(String args[])

{
Scanner s= new Scanner(System.in);
System.out.println("enter percentage ");
float per= s.nextFloat();
if( per >80 )
{
  System.out.println("maths marks");
  float maths= s.nextFloat();

if( maths>80)
{
 System.out.println("Eligible for admission");
}
else
{
 System.out.println("maths marks are less ");
}

}
else
System.out.println("total percentage is less ");


}


}






