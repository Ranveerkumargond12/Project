package pattern;

public class UppercaseAlphaPattern {
 
    void lAngle(){
        int n=4;
        char data='A';
        for(int i=1; i<=n; i++){
             
            for(int j=1; j<=i; j++){
                System.out.print(data +" ");
                data++;
            }

            System.out.println();
        }

    }



public static void main(String[] args) {
        UppercaseAlphaPattern obj=new UppercaseAlphaPattern();
        obj.lAngle();
    }
}


/*
Left side triangle with sequence of uppercase alphabets
A 
B C 
D E F 
G H I J 
 
*/ 



