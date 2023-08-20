
class java2
{
	 public java2 test()
	 {
		 System.out.println("hiii");
		 return new java2();
	 }
}

public class Java extends java2 {
 

	public Java test()
 {
		System.out.println("Hello");
	return new Java();
 }
	public static void main(String[] args) {
		java2 j=new Java();
		j.test();
	}
}
