import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class PetShopControllerTest extends TestCase {

    PetShopController controller = PetShopController.getInstance();

    @Test
    public void testCheckLine() {
    controller.checkLine("29/05/2022 5 4");
    Assert.assertTrue(controller.getDate() instanceof LocalDate);
    Assert.assertTrue(controller.getBigPets() == 4);
    Assert.assertTrue(controller.getSmallPets() == 5);
    }
}
