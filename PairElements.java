import java.io.*;
public class PairElements
{
    public static void main(String args[])
    {
        int s=0,n=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr1[]=new int[20];
        int pair[][]=new int[20][2];
        System.out.println("Enter no of elements ");
        try
        {
            n=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Error in inputing");
        }
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
            try
            {
                arr1[i]=Integer.parseInt(br.readLine());
            }
            catch(Exception e)
            {
                System.out.println("Error in inputing");
            }
        }
        try
        {
            System.out.println("Enter a sum number");
            s=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            System.out.println("Error in inputing");
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr1[i]+arr1[j]==s)
                {
                    pair[cnt][0]=arr1[i];
                    pair[cnt++][1]=arr1[j];
                }
            }
        }
        System.out.println("Pairs are");
        for(int i=0;i<cnt;i++)
        {
            System.out.println(pair[i][0]+","+pair[i][1]);
        }
    }
}