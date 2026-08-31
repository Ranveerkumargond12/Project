import java.util.*;
public class Matrix {
  Scanner sc=new Scanner(System.in);
  void array()
  {
    System.out.println("Enter the row of array:");
    int r=sc.nextInt();
    System.out.println("Enter the column of array:");
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("Enter the Element of array:");
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    } 

    System.out.println("Array List:");
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }




    public  static void main(String[] args){
        Matrix obj = new Matrix();
        obj.array();
    }
}
