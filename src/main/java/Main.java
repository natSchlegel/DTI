import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetShopService service = new PetShopService();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        service.controller.checkLine(line);
        service.model.configPetShops();
        service.calcTotalPrice();
        service.sortSequence();
        service.outputSequence();
    }
}
