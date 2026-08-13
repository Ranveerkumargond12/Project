package pattern;

public class StarPattern {
    void lAngle(){
        int n=4;
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }

            System.out.println();
        }

    }



public static void main(String[] args) {
        StarPattern obj=new StarPattern();
        obj.lAngle();
    }
}


/*
Left side triangle
 *
 * *
 * * *
 * * * *
 
*/ 