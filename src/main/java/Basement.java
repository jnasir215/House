public class Basement extends Room implements Closets, Electricity, Entertainment {

    public Basement(String name, String floorType, String roomSize) {
        super(name, floorType, roomSize);
    }

    @Override
    public int numClosets() {
        return 2;
    }

    @Override
    public int numOutlets() {
        return 4;
    }

    @Override
    public int numWallUnits() {
        return 4;
    }

    @Override
    public boolean hasCeilingLightFixture() {
        return true;
    }

    @Override
    public boolean hasCeilingFan() {
        return false;
    }

    @Override
    public boolean hasTelevision() {
        return true;
    }

    @Override
    public boolean hasStereo() {
        return true;
    }

    @Override
    public boolean hasVideoGameConsole() {
        return true;
    }
}
