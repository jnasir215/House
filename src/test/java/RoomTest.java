import org.junit.Assert;
import org.junit.Test;

public class RoomTest {

    @Test
    public void testRoomClass() {
        String name = "321 Room Template";
        String floor = "Carpet";
        String size = "Roomy";
        Room room = new Room(name, floor, size);

        String expected = "321 Room Template";
        String actual = room.getName();

        Assert.assertEquals(expected, actual);
    }
}
