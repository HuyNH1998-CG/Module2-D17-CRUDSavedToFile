import java.util.List;
import java.util.Scanner;

public class Manage {
    public static List<Product> list = IOOperator.readDataFromFile("E:\\Module2-D17-CRUDtoBinaryFile\\new.txt");
    static Scanner input = new Scanner(System.in);

    public static void add() {
        String productID = getProductID();
        String productName = getProductName();
        String maker = getMaker();
        String price = getPrice();
        String others = getOthers();
        list.add(new Product(productID,productName,maker,price,others));
    }

    public static void saveFile() {
        IOOperator.writeToFile("E:\\Module2-D17-CRUDtoBinaryFile\\new.txt",list);
    }

    private static String getOthers() {
        System.out.println("Others");
        return input.nextLine();
    }

    private static String getPrice() {
        System.out.println("Price");
        return input.nextLine();
    }

    private static String getMaker() {
        System.out.println("Maker");
        return input.nextLine();
    }

    private static String getProductName() {
        System.out.println("Product Name");
        return input.nextLine();
    }

    private static String getProductID() {
        System.out.println("Product ID");
        return input.nextLine();
    }

    public static void show(){
        for (Product p : list){
            System.out.println(p);
        }
    }

    public static void search(){
        String productName = input.nextLine();
        for (Product p : list){
            if (p.getProductName().equals(productName)){
                System.out.println(p);
            }
        }
    }

    public static void remove(){
        String name = getProductName();
        list.removeIf(P -> P.getProductName().equals(name));
    }
    public static void edit(){
        String name = getProductName();
        for(Product P : list){
            if (P.getProductName().equals(name)){
                while(true){
                    System.out.println("1. Product ID");
                    System.out.println("2. Product Name");
                    System.out.println("3. Maker");
                    System.out.println("4. Price");
                    System.out.println("5. Others");
                    System.out.println("6. Exit");

                    String choice = input.nextLine();
                    switch (choice){
                        case "1" -> P.setProductID(getProductID());
                        case "2" -> P.setProductName(getProductName());
                        case "3" -> P.setMaker(getMaker());
                        case "4" -> P.setPrice(getPrice());
                        case "5" -> P.setOthers(getOthers());
                        case "6" -> {
                            return;
                        }
                        default -> {
                            System.out.println("Invalid input, do you want to exit?");
                            System.out.println("Input yes to exit");
                            String answer = input.nextLine();
                            if (answer.equals("yes")){
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
