import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws Exception {
        System.out.println("\n  ----------> Robin Cafe <----------\n====================\n");
        System.out.println("This is the official Menu of Robin Cafe, Choose item from here :\n");
        System.out.println("1. Coffee.\n2. Tea.\n3. Milkshake.\n4. Cup Cake.\n5. exit.\n====================\n");
        Scanner scan = new Scanner(System.in);
        int order = 0;
        try{
        do{
            System.out.print("Type the item number from the menu that you want : ");
            if(!scan.hasNextInt()){
                System.out.println("enter a valid number.");
                scan.next();
                continue;
            }
                order = scan.nextInt();
                switch(order){
                    case 1: System.out.println("You have ordered Coffee."); break;
                    case 2: System.out.println("You have ordered Tea."); break;
                    case 3: System.out.println("You have ordered Milkshake."); break;
                    case 4: System.out.println("You have orderde Cup Cake."); break;
                    case 5: System.out.println("====================\nYou have successfully existed the system.\n ----------> visit us again <---------- "); break;
                    default: System.out.println("You have ordered the item that doesnot exists."); break;
                }
                
            }while(order != 5);
        }catch( Exception e){
            System.out.println("this excpn occured : "+e.getMessage());
        }
        finally{
            scan.close();

        }
        
        
    }
}
