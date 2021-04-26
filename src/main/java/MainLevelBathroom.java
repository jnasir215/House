public class MainLevelBathroom extends Room implements Water, Electricity {

    public MainLevelBathroom(String name, String floorType, String roomSize) {
        super(name, floorType, roomSize);
    }

    @Override
    public boolean hasSink() {
        return true;
    }

    @Override
    public boolean hasToilet() {
        return true;
    }

    @Override
    public boolean hasShower() {
        return false;
    }

    @Override
    public boolean hasBathtub() {
        return false;
    }

    @Override
    public boolean hasBathShower() {
        return false;
    }

    @Override
    public int numOutlets() {
        return 0;
    }

    @Override
    public int numWallUnits() {
        return 1;
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
