import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PetShopController {

    private static PetShopController intance;
    static PetShopController getInstance() {
        if (intance == null) {
            intance = new PetShopController();
        }
        return intance;
    }

    private PetShopController()	{
        super();
    }

    private LocalDate date;
    private int smallPets;
    private int bigPets;

    public LocalDate getDate() {
        return date;
    }

    public int getSmallPets() {
        return smallPets;
    }

    public int getBigPets() {
        return bigPets;
    }

    public void checkLine(String line) {
        String[] data = line.split(" ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = LocalDate.parse(data[0],formatter);
        smallPets = Integer.parseInt(data[1]);
        bigPets = Integer.parseInt(data[2]);
    }
}
