
import java.util.ArrayList;
public class Stack
{

private  ArrayList<Integer> a;

	public Stack() {
		a=new ArrayList<Integer>();
		
	}
	
	public  void push(int array) {
	
		a.add(array);
		
	
		}
	
	public void removeEle(int e) {
		a.remove(e);
	
	}

		public void pop() {
			
				System.out.println(a);
			}
		
	
	
	
}
