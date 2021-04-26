public class Garage extends Room implements Storage, Electricity {

    public Garage(String name, String floorType, String roomSize) {
        super(name, floorType, roomSize);
    }

    @Override
    public int holdsCars() {
        return 2;
    }

    @Override
    public String storageCapacity() {
        return "Significant";
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
