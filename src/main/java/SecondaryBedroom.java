public class SecondaryBedroom extends Room implements Electricity, Closets, Entertainment {

    public SecondaryBedroom(String name, String floorType, String roomSize) {
        super(name, floorType, roomSize);
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
        return true;
    }

    @Override
    public int numClosets() {
        return 1;
    }

    @Override
    public boolean hasTelevision() {
        return false;
    }

    @Override
    public boolean hasStereo() {
        return false;
    }

    @Override
    public boolean hasVideoGameConsole() {
        return true;
    }

}
