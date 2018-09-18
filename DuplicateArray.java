import java.io.*;
public class DuplicateArray{
     public static void main(String []args){
        int n=0;
        int arr2[]= new int[20];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr1[]=new int[20];
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
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    arr2[cnt++]=arr1[i];
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr2[i]==arr2[j])
                {
                    int k=j;
                    while(k<cnt)
                    {
                        arr2[k++]=arr2[k+1];
                        cnt--;
                    }
                }
            }
        }
        System.out.println("Duplicate Array Elements are");
        for(int i=0;i<cnt;i++)
        {
            System.out.print(" "+arr2[i]);
        }
     }
}