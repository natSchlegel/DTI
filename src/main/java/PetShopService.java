import Entities.BestOfferList;
import Entities.PetShop;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Comparator;

public class PetShopService {

    private double smallPetsPrice;
    private double bigPetsPrice;
    private double totalPrice;
    private ArrayList<BestOfferList> bestOffers = new ArrayList<BestOfferList>();
    //PetShopModel model =

    PetShopController controller = PetShopController.getInstance();
    PetShopModel model = PetShopModel.getInstance();

    public void calcTotalPrice() {
        for (PetShop petshop : model.getPetShopList()) {
            if (controller.getDate().getDayOfWeek() == DayOfWeek.SUNDAY || controller.getDate().getDayOfWeek() == DayOfWeek.SATURDAY) {
                smallPetsPrice = controller.getSmallPets() * petshop.getWeekendSmallPetsPrice();
                bigPetsPrice = controller.getBigPets() * petshop.getWeekendBigPetsPrice();
            } else {
                smallPetsPrice = controller.getSmallPets() * petshop.getSmallPetsPrice();
                bigPetsPrice = controller.getBigPets() * petshop.getBigPetsPrice();
            }
            totalPrice = smallPetsPrice + bigPetsPrice;
            bestOffers.add(new BestOfferList(petshop.getName(),totalPrice, petshop.getDistance()));
        }
    }
    public void sortSequence(){
        Comparator<BestOfferList> compareByPriceThenDistance = Comparator.comparing(BestOfferList::getTotalPrice).thenComparing(BestOfferList::getDistance);
        bestOffers.sort(compareByPriceThenDistance);
    }
    public void outputSequence(){
        for(BestOfferList bestOffer: bestOffers) {
            System.out.println("Nome do PetShop: " + bestOffer.getPetshopName() + " / Preço Total: " + bestOffer.getTotalPrice());
        }
    }
}
