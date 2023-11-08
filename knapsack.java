import java.util.*;

public class knapsack{
	public static int knapSack(int weight, int P[], int W[], int n){
		int dp[]=new int[weight+1];

		for(int i=0;i<n;i++){
			for(int j=weight;j>=0;j--){
				if(W[i]<=j){
					dp[j]=Math.max(dp[j],dp[j-W[i]]+P[i]);
					}
				}
			}
			return dp[weight];
		}

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

		System.out.println("Enter the maximum weight: ");
		int weight=sc.nextInt();

		System.out.println("Profit: "+knapSack(weight,P,W,n));
		}
	}