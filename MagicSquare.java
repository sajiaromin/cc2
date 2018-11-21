package magicsquare;

import java.util.Scanner;

public class MagicSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Give an odd number: ");
        int n = console.nextInt();
        
       if(n % 2 == 0 ){
        System.out.println("Invalid input. ");
        msq();
    }
    else if (n ==1 ){
        System.out.println("Invalid input. 3 is the lowest valid odd number");
        msq();
    }
    else{
         int[][] magicSquare = new int[n][n];

        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println(n+" is a Magic square");
        System.out.println("Would you like to try again? [1]Yes [2] No");
        int choice = console.nextInt();
        
        switch(choice){
            case 1:
                
                msq();
                break;
            case 2:
                System.out.println("Thank you! Have a nice day! ");
                break;
        }
        System.out.println();
    }
       
        
    }

    public static void msq() {
        Scanner console = new Scanner(System.in);

        System.out.println("Give an odd number: ");
        int n = console.nextInt();
        int[][] magicSquare = new int[n][n];
 if(n % 2 == 0 ){
        System.out.println("Invalid input. ");
        msq();
    }
    else if (n ==1 ){
        System.out.println("Invalid input. 3 is the lowest valid odd number");
        msq();
    }
        int number = 1;
        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        while (number <= n * n) {
            magicSquare[row][column] = number;
            number++;
            curr_row = row;
            curr_col = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (magicSquare[row][column] != 0) {
                row = curr_row + 1;
                column = curr_col;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println(n+" is a Magic square");
        System.out.println("Would you like to try again? [1]Yes [2] No");
        int choice = console.nextInt();
        
        switch(choice){
            case 1:
                
                msq();
                break;
            case 2:
                System.out.println("Thank you! Have a nice day! ");
                break;
        }
        System.out.println();
    }
    
}
