
import java.util.Scanner;
public class Driver {
	
	private static Scanner scannerObject;

	public static void main(String args[])

{

		int in,index=-1;
	


Stack StackObject=new Stack();
scannerObject = new Scanner(System.in);

System.out.println("\n1-Add Element \n 2-remove Element\n 3-Display All\n 4-Exit\n");	
while((in=scannerObject.nextInt())!=4) 
{
	
     switch(in)
  {
    case 1:
	System.out.println("\nEnter value to add -1 to Exit\n");
	int val;
	while((val=scannerObject.nextInt())!=-1) 
	{
	StackObject.push(val);
	index++;
	System.out.println("\nEnter value to add -1 to Exit\n");
	}
	break;
	
    case 2:
	System.out.println("\nEnter index to remove should be less than "+index+" -1 to Exit\n");
	int indexNumber;
	while((indexNumber=scannerObject.nextInt())!=-1) 
	{
	if(indexNumber<=index) 
	{
		StackObject.removeEle(indexNumber);
	index--;
	}
	else
	System.out.println("\nindex should be less than"+index);
	
	System.out.println("\nEnter index to remove should be less than "+index+" -1 to Exit\n");
	}
	break;
    
    case 3:
	StackObject.pop();
	break;
	
	default:
		System.out.println("invalid entry");
	
   }
     
    System.out.println("\n1-Add Element \n 2-remove Element\n 3-Display All\n 4-Exit\n");	
}

System.out.println("you exited the programme");

}

}
