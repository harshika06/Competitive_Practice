//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
               int count = 0;
               for(int i=0;i<n;i++)
               {
                   int num = a[i];
                   int temp = num ;
                   int rev = 0;
                   while(num>0)
                   {
                   int digit = num%10;
                    rev = rev*10+digit;
                   num= num/10;
                   
                   }
                   if(temp == rev)
                   {
                       count++;
                   }
                   else
                   {
                       count--;
                   }
                   
                   
               }
               if(count == n)
               {
                   return 1;
               }
               else
               {
                   return 0;
               }
                   
           }
}