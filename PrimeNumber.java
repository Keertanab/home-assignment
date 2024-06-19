package week1day2.homeassignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 7;
boolean prime = true;
for (int i = 2; i < n; i++) {
	if (n%i==0)
	{
		prime = false;
		break;
	}

	}
if (prime==true)
{
	System.out.println("The given number "+n+" is prime");
}
else {
	System.out.println("The given number "+n+" is not prime");
}


}
	}


