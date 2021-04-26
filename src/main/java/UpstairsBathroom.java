public class UpstairsBathroom extends Room implements Water, Electricity {

    public UpstairsBathroom(String name, String floorType, String roomSize) {
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
        return true;
    }

    @Override
    public int numOutlets() {
        return 1;
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
