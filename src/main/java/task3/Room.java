package task3;

public class Room {

    public Room(String roomName, String smell, Members members, String sound){
        this.roomName = roomName;
        this.smell = smell;
        this.members = members;
        this.sound = sound;
    }
    private String roomName;

    private String smell = null;
    private Members members;

    private String sound = null;


    private Thing thing;

    public Thing getThing(){
        return thing;
    }

    public void getIn(Human human) {
        this.members.addMember(human);
    }

    public void getOut(Human human) {
        this.members.removeMember(human);
    }

    public void setThing(Thing thing){
        this.thing = thing;
    }
}
