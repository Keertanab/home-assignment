package week1day2.homeassignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int output = 0;
int input = 6776;
int num = input;
for (int i = input; i > 0 ; i=i/10) {
	int rem = input%10;
	output = (output*10)+rem;
	input = input/10;
	
	
}

if (num==output)
	System.out.println(num + " is Palindrome");
else
	System.out.println(num + " is not a Palindrome");
	
	}

}
