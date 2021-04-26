import org.junit.Assert;
import org.junit.Test;

public class KitchenTest {

    @Test
    public void testKitchenElectricity1() {
        String name = "321 Kitchen";
        String floor = "Tile";
        String size = "Spacious";
        Kitchen kitchen = new Kitchen(name, floor, size);

        int outletsExpected = 4;
        int outletsActual = kitchen.numOutlets();

        Assert.assertEquals(outletsExpected, outletsActual);
    }
}
