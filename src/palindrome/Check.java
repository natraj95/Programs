package palindrome;

public class Check {
	public static void main(String[] args) {
		int n= 454;
		int a,i=0,j=0;
		a=n;
		while (a>0){
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			
		}
		if(n==j){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not palindrome");
		}
	}

}
