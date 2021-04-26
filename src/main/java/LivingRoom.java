public class LivingRoom extends Room implements Accessories, Electricity {

    public LivingRoom(String name, String floorType, String roomSize) {
        super(name, floorType, roomSize);
    }
    @Override
    public boolean hasChandelier() {
        return false;
    }

    @Override
    public boolean hasFamilyPictures() {
        return true;
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
        return 4;
    }

    @Override
    public boolean hasCeilingLightFixture() {
        return false;
    }

    @Override
    public boolean hasCeilingFan() {
        return false;
    }
}
