package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int n=29;
		boolean prime=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				prime=true;
				break;
				
			}
		}
		if(prime)
				System.out.println("The number "+n+" is not prime");
			else
				System.out.println("The number "+n+" is  prime");
		

	}

}
