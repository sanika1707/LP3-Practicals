import java.util.*;

public class Fractional{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int n=sc.nextInt();

		int P[]=new int[n];
		System.out.println("Enter the profit in order: ");
		for(int i=0;i<n;i++){
			P[i]=sc.nextInt();
			}

		int W[]=new int[n];
		System.out.println("Enter the weight in order: ");
		for(int i=0;i<n;i++){
			W[i]=sc.nextInt();
			}

		System.out.println("Enter the Maximum weight: ");
		int weight=sc.nextInt();

		double maxProfit=0;

		for(int i=0;i<n;i++){
			if(W[i]<weight){
				weight=weight-W[i];
				maxProfit=maxProfit+P[i];
				}
			else{
				double d1=weight;
				double d2=W[i];

				double d=(d1/d2)*P[i];

				maxProfit=maxProfit + d;
				weight=0;
				}

			}

			System.out.println("Profit: "+maxProfit);

		}
	}