package test;

class cross
{
	void print()
{
		System.out.println("Always success for cross");
}
} 
public class rosary extends cross
 {
	void print()
{
		System.out.println("Always JMJ ");
	}
	public static void main(String[] args)
 {
		cross a=new rosary();
		a.print();
}
}
