public class Kitchen extends Room implements Electricity, Appliances, Water {

    public Kitchen(String name, String floorType, String roomSize) {
        super(name, floorType, roomSize);
    }

    @Override
    public int numOutlets() {
        return 4;
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
        return true;
    }

    @Override
    public boolean hasRefrigerator() {
        return true;
    }

    @Override
    public boolean hasStove() {
        return true;
    }

    @Override
    public boolean hasMicrowave() {
        return true;
    }

    @Override
    public boolean hasSink() {
        return true;
    }

    @Override
    public boolean hasToilet() {
        return false;
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

}
