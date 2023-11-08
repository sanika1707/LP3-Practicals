import java.util.*;

public class recursiveFibonacci{
	public static int recursiveFibonacci(int n){
		if(n<=1){
			return n;
			}
		else{
			return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
			}
		}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
			System.out.print(recursiveFibonacci(i)+" ");

			}

}