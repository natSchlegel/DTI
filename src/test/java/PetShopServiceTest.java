import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PetShopServiceTest extends TestCase {

    @Test
    public void testCalcTotalPrice() {
        LocalDate date = LocalDate.of(2022, 05, 28); // saturday
        Assert.assertTrue(date.getDayOfWeek() == DayOfWeek.SATURDAY);
        Assert.assertFalse(date.getDayOfWeek() == DayOfWeek.SUNDAY);
    }
}
