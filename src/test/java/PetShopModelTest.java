import Entities.PetShop;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PetShopModelTest extends TestCase {

    PetShopModel model = new PetShopModel();

    @Test
    public void testConfigPetShops() {
        PetShop petShop = new PetShop("Catiorros - Teste", 1500.00,20.00,40.00,20.00,40.00);
        model.getPetShopList().add(petShop);
        Assert.assertTrue(model.getPetShopList().contains(petShop));
    }

    @Test
    public void testGetPetShopList() {
        PetShop petShop = new PetShop("Catiorros - Teste", 1500.00,20.00,40.00,20.00,40.00);
        model.getPetShopList().add(petShop);
        Assert.assertTrue(model.getPetShopList().size()>0);
    }
}