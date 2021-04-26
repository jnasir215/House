public class Office extends Room implements Electricity, Study {

    public Office(String name, String floorType, String roomSize) {
        super(name, floorType, roomSize);
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

    @Override
    public boolean hasBookcases() {
        return true;
    }

    @Override
    public boolean hasOfficeDesk() {
        return true;
    }

    @Override
    public boolean hasDesktopComputer() {
        return true;
    }

}
