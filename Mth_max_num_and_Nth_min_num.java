import java.util.Scanner;
public class Mth_max_num_and_Nth_min_num
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Elements\n");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("M = ");
        int M=input.nextInt();
        System.out.print("N = ");
        int N=input.nextInt();
        System.out.print(M+" Maximum Number = "+arr[n-M]);
        System.out.println("\n"+N+" Minimum Number = "+arr[N-1]);
        int Sum=(arr[n-M]+arr[N-1]);
        int Difference=(arr[n-M]-arr[N-1]);
        System.out.print("Sum = "+Sum);
        System.out.print("\nDifference = "+Difference);
    }
}import java.util.Scanner;
public class Mth_max_num_and_Nth_min_num
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=input.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the Elements\n");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("M = ");
        int M=input.nextInt();
        System.out.print("N = ");
        int N=input.nextInt();
        System.out.print(M+" Maximum Number = "+arr[n-M]);
        System.out.println("\n"+N+" Minimum Number = "+arr[N-1]);
        int Sum=(arr[n-M]+arr[N-1]);
        int Difference=(arr[n-M]-arr[N-1]);
        System.out.print("Sum = "+Sum);
        System.out.print("\nDifference = "+Difference);
    }
}
