public class DiningRoom extends Room implements Accessories, Electricity {

    public DiningRoom(String name, String floorType, String roomSize) {
        super(name, floorType, roomSize);
    }

    @Override
    public boolean hasChandelier() {
        return true;
    }

    @Override
    public boolean hasFamilyPictures() {
        return false;
    }

    @Override
    public boolean hasPaintings() {
        return true;
    }

    @Override
    public int numOutlets() {
        return 2;
    }

    @Override
    public int numWallUnits() {
        return 0;
    }

    @Override
    public boolean hasCeilingLightFixture() {
        return true;
    }

    @Override
    public boolean hasCeilingFan() {
        return false;
    }
}
