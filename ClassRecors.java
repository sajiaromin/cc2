package classrecors;

import java.io.*;
import java.util.*;
public class ClassRecors {
    static ArrayList<String> records = new ArrayList<String>();
    
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
         
        int exit = 0, choice;
        while(exit == 0){
            System.out.print("[1] Add Records \n"
                    + "[2] View Records \n"
                    + "[3] Exit \n"
                    + "Enter your choice: ");
            choice = Integer.parseInt(input.readLine());
            System.out.println("");
            
            switch(choice){
                case 1:
                    addRecord(input);
                    System.out.println("");
                    break;
                case 2:
                    display();
                    System.out.println("");
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
    
    public static void addRecord(BufferedReader input)throws IOException{
        String csm, csf, lsm, lsf, es, mg, fg;
        double dmg, dfg, ffg, tcsm, tlsm, tcsf, tlsf, tes;
        
        System.out.print("Enter your ID number: ");
        records.add(input.readLine());
        System.out.print("Enter your Last Name: ");
        records.add(input.readLine());
        System.out.print("Enter your First Name: ");
        records.add(input.readLine());
        System.out.print("Enter your Middle Initial: ");
        records.add(input.readLine());
        System.out.println("");
        
        System.out.println("For midterms:");
        System.out.println("Please enter the total score of: ");
        System.out.print("Class Standing: ");
        tcsm = Double.parseDouble(input.readLine());
        System.out.print("Laboratory: ");
        tlsm = Double.parseDouble(input.readLine());
        System.out.println("Now please enter your class standing score and laboratory score:");
        System.out.print("Class Standing: ");
        csm = input.readLine();
        System.out.print("Laboratory: ");
        lsm = input.readLine();
        System.out.println("");
        
        System.out.println("For finals:");
        System.out.println("Please enter the total score of: ");
        System.out.print("Class Standing: ");
        tcsf = Double.parseDouble(input.readLine());
        System.out.print("Laboratory: ");
        tlsf = Double.parseDouble(input.readLine());
        System.out.println("Now please enter your class standing score and laboratory score:");
        System.out.print("Class Standing: ");
        csf = input.readLine();
        System.out.print("Laboratory: ");
        lsf = input.readLine();
        System.out.println("");
        
       
        System.out.print("Please enter exams total score: ");
        tes = Double.parseDouble(input.readLine());
        System.out.print("Enter your exam score: ");
        es = input.readLine();
        
        dmg = ((Double.parseDouble(csm)/tcsm)*33) + ((Double.parseDouble(lsm)/tlsm)*33) + ((Double.parseDouble(es)/tes)*34);
        dfg = ((Double.parseDouble(csf)/tcsf)*33) + ((Double.parseDouble(lsf)/tlsf)*33);
        ffg = (dmg*.50)+(dfg*.50);
        
        records.add(Integer.toString((int)Math.round(dmg)));
        records.add(Integer.toString((int)Math.round(dfg)));
        
        if((int)Math.round(ffg) >= 75){
            records.add("Passed");
        }else{
            records.add("Failed");
        }
        
    }
    
    public static void display(){
        System.out.println("ID#                 \t Last Name            \t First Name         \t Middle Initial \t Midterm Grade \t         Final Grade \t         Remarks");
        int ch = 6;
        for(int i = 0; i < records.size() ; i++){
            if(i == ch){
                System.out.printf("%-16s \n", records.get(i));
                ch+=7;
            }else{
                System.out.printf("%-16s \t ", records.get(i));
            }
        }
    }
    
}
