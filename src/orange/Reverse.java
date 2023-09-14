package orange;

public class Reverse {
	public static void main(String[] args) {
		int n=345;
		int a,i=0,j=0;
		 a=n;
		 while (a>0){
			 i=a%10;
			 j=(j*10)+i;
			 a=a/10;
			 
		 }
		 System.out.println(j);
	}

}
