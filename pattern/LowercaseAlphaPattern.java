package pattern;

public class LowercaseAlphaPattern {
    void lAngle(){
        int n=4;
        char data='a';
        for(int i=1; i<=n; i++){
             
            for(int j=1; j<=i; j++){
                System.out.print(data +" ");
                data++;
            }

            System.out.println();
        }

    }



public static void main(String[] args) {
        LowercaseAlphaPattern obj=new LowercaseAlphaPattern();
        obj.lAngle();
    }
}


/*
Left side triangle with sequence of lowercase alphabets
 a 
b c 
d e f 
g h i j 
 
*/ 

