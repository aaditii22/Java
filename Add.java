import java.util.Scanner;
class Add{
	public  void main(String args[]){
		int a,b,sum;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two integers:");
		a=in.nextInt();
		b=in.nextInt();
		sum=a+b;
		System.out.println("Sum of "+a+" and "+b+"="+sum);
	}
}