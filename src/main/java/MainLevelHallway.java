public class MainLevelHallway extends Hallway implements Stairway, Closets, Electricity {

    public MainLevelHallway(String name, String floorType) {
        super(name, floorType);
    }

    @Override
    public int numClosets() {
        return 1;
    }

    @Override
    public String stairsLeadingTo() {
        return "Upstairs Hallway";
    }

    @Override
    public int numOutlets() {
        return 1;
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
