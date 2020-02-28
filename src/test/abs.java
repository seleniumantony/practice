package test;
class antony{
	 void display(int i){
		 System.out.println(+i);
	 }
	 void display(String s){
		 System.out.println(s);
	 }
	 void display(int a,int b,String f){
		 System.out.println(a+"" +b+ ""+f);
	 }
}
	 public class abs {	 
	public static void main(String[] args) {
antony a=new antony();
a.display(5);a.display("JMJ");a.display(15, 7, "Anton");
	}

}

