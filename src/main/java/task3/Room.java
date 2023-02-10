package task3;

import java.util.ArrayList;

public class Room {

    private String smell;
    private String sound;
    private final ArrayList<Human> humans;
    private final ArrayList<Thing> things;

    public Room(String smell, String sound, ArrayList<Human> humans, ArrayList<Thing> things) {
        this.smell = smell;
        this.sound = sound;
        this.humans = humans;
        this.things = things;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void addHuman(Human human) {
        this.humans.add(human);
    }

    public void addThing(Thing thing) {
        this.things.add(thing);
    }

    public void removeHuman(Human human) {
        this.humans.remove(human);
    }

    public void removeThing(Thing thing) {
        this.things.remove(thing);
    }

    public int getHumanNum() {
        return this.humans.size();
    }

    public int getThingNum() {
        return this.things.size();
    }

    @Override
    public String toString() {
        return  "в комнате запах " + this.smell +
                " и звук " + this.sound +
                ", " + this.humans.size() + " людей" +
                " и " + this.things.size() + " существ";
    }
}
