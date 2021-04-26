public class Room {

    String name;
    String floorType;
    String roomSize;

    public Room() {

    }

    public Room(String name, String floorType, String roomSize) {
        this.name = name;
        this.floorType = floorType;
        this.roomSize = roomSize;
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

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }
}
