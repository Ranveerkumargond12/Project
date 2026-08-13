package pattern;

public class NumberSequencePattern {
    void lAngle(){
        int n=4;
        int data=1;
        for(int i=1; i<=n; i++){
             
            for(int j=1; j<=i; j++){
                System.out.print(data +" ");
                data++;
            }

            System.out.println();
        }

    }



public static void main(String[] args) {
        NumberSequencePattern obj=new NumberSequencePattern ();
        obj.lAngle();
    }
}


/*
Left side triangle with sequence of numbers
1 
2 3 
4 5 6 
7 8 9 10
 
*/ 

