import java.util.Scanner;
public class Main{
    public static void main (String[] args) throws Exception {
        System.out.println("\n  Pande Cotage Cafe\n================");
        System.out.println("choose the item from the menu :\n");
        System.out.println("1. Coffee\n2. Tea\n3. Milkshake\n4. exit\n==================\n");
        
        Scanner scan = new Scanner(System.in);
        int order = 0;
        try{
        do{
            System.out.print("type the number of the given item from the menu : ");
            if(!scan.hasNextInt()){
                System.out.println("enter a valid number .");
                scan.next();
                continue;
            }
                order = scan.nextInt();
                switch(order){
                    case 1: System.out.println("you have ordered Coffee"); break;
                    case 2: System.out.println("you have ordered Tea"); break;
                    case 3: System.out.println("you have ordered Milkshake"); break;
                    case 4: System.out.println("===========================================\nyou have successfully existed the system\n---------------- visit us again -----------------"); break;
                    default: System.out.println("you have ordered the order that doesnot exists"); break;
                }
                
            }while(order != 4);
        }catch( Exception e){
            System.out.println("this excpn occured : "+e.getMessage());
        }
        finally{
            scan.close();

        }
        
        
    }
}
