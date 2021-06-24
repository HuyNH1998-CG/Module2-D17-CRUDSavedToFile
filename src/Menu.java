import java.util.Scanner;

public class Menu {
    public static void menu(){
        while(true) {
            System.out.println("Product Management System");
            System.out.println("1. add");
            System.out.println("2. show");
            System.out.println("3. search");
            System.out.println("4. remove");
            System.out.println("5. edit");
            System.out.println("6. save list");
            System.out.println("7. exit");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            switch (choice) {
                case "1" -> Manage.add();
                case "2" -> Manage.show();
                case "3" -> Manage.search();
                case "4" -> Manage.remove();
                case "5" -> Manage.edit();
                case "6" -> Manage.saveFile();
                case "7" -> System.exit(0);
                default -> System.out.println("Invalid input, re input");
            }
        }
    }
}
