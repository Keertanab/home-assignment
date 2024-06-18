package week1day2.homeassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 8 ;
int firstNum = 0 ;int secondNum = 1 ;
int nextNum ;

for(int i=1;i<=n;i++) {
System.out.print(firstNum +",");
  nextNum= firstNum + secondNum; 
 firstNum = secondNum;
 secondNum = nextNum;
 

}
	}

}
