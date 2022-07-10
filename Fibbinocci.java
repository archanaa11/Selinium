package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		int n=0;
		int s=1;
		int sum=0;
		System.out.println("The Fibbinocci Series is");
		System.out.println(n);
		System.out.println(s);
		for (int i=1;i<10;i++)
		{

			sum=n+s;
			System.out.println(" "+sum);
			n=s;
			s=sum;
				
		}
				

	}

}
