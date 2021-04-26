public class UpstairsHallway extends Hallway implements Stairway, Closets, Electricity {

    public UpstairsHallway(String name, String floorType) {
        super(name, floorType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    @Override
    public int numClosets() {
        return 1;
    }

    @Override
    public String stairsLeadingTo() {
        return "Living Room";
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
