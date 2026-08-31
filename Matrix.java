import java.util.*;
public class Matrix {
  Scanner sc=new Scanner(System.in);
  void array()
  {
    System.out.println("Enter the row of array 1:");
    int r=sc.nextInt();
    System.out.println("Enter the column of array 1:");
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("Enter the Element of array 1:");
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    } 

    System.out.println("Array List 1:");
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("Enter the row of array 2:");
    int r2=sc.nextInt();
    System.out.println("Enter the column of array 2:");
    int c2=sc.nextInt();
    int arr2[][]=new int[r2][c2];
    System.out.println("Enter the Element of array 2:");
    for(int i=0;i<arr2.length;i++)
    {
      for(int j=0;j<arr2.length;j++)
      {
        arr2[i][j]=sc.nextInt();
      }
    } 

    System.out.println("Array List 2:");
    for(int i=0;i<arr2 .length;i++)
    {
      for(int j=0;j<arr2.length;j++)
      {
        System.out.print(arr2[i][j]+" ");
      }
      System.out.println();
    }

    // sum of array
    System.out.println("Sum of Array 1 and Array 2:");
      int sum[][]=new int [r][c];
      for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        sum[i][j]=arr[i][j]+arr2[i][j]; 
        System.out.print(sum[i][j]+" ");
      }  
      System.out.println();
    }

    System.out.println();
    // sub of array
    System.out.println("Subtraction of Array 1 and Array 2:");
      int sub[][]=new int [r][c];
      for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        sub[i][j]=arr[i][j]-arr2[i][j]; 
        System.out.print(sub[i][j]+" ");    
      }  
      System.out.println();
    }

    System.out.println();
    // div of array
    System.out.println("Division of Array 1 and Array 2:");
      int div[][]=new int [r][c];
      for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
        div[i][j]=arr[i][j]/arr2[i][j]; 
        System.out.print(div[i][j]+" ");    
      }  
      System.out.println();
    }
}

    



    public  static void main(String[] args){
        Matrix obj = new Matrix();
        obj.array();
    }
}
