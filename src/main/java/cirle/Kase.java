package cirle;

import java.util.Scanner;

public class Kase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кто родственник Битч : ");
        String age = scanner.nextLine();
        switch (age){
            case "Батя ":
                System.out.println("Genialno");
                break;
            case "Мама":
                System.out.println("hern9");
                break;
            case "Брат":
                System.out.println("syper");
                break;
            case "swat":
                System.out.println("asda");
                break;
            default:
                System.out.println("НИчего не подошло ! ");
        }
        

    }
}
