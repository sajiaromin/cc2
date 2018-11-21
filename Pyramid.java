package pyramid;

public class Pyramid {

    public static void main(String[] args) {
        System.out.println("Asterist Pyramid");
        
        for (int i =1; i < 8; i +=2){
            for(int k = 0; k < (4-i /2); k++){
                System.out.print("  ");
            }
            for (int j = 0; j <i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("Inverted Pyramid");
        
        int n = 8;
        int i = n;
        while( i >0 ){
            for(int k = 0; k <(n - i)/1; k++){
                System.out.print(" ");
            }
            for(int j=1; j<i; j++){
                System.out.print(" *");
            }
            System.out.println();
            
            i = i *4/5;
        }
        
    }
    
}
