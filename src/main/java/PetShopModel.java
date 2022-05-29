import Entities.PetShop;

import java.util.ArrayList;
import java.util.List;

public class PetShopModel {
    private List<PetShop> petShopList = new ArrayList<>();

    public void addNewPetShop(String name, Double distance, Double smallPetsPrice, Double bigPetsPrice, Double weekendSmallPetsPrice, Double weekendBigPetsPrice){
        petShopList.add(new PetShop(name,distance,smallPetsPrice,bigPetsPrice,weekendSmallPetsPrice,weekendBigPetsPrice));
    }

    public void configPetShops(){
        addNewPetShop("Meu Canino Feliz", 2000.00,20.00,40.00,24.00,48.00);
        addNewPetShop("Vai Rex", 1700.00,15.00,50.00,20.00,55.00);
        addNewPetShop("ChowChawgas", 800.00,30.00,45.00,30.00,45.00);
    }

    public List<PetShop> getPetShopList() {
        return petShopList;
    }
}
