package task3;

import java.util.ArrayList;

public class Room {

    private String smell;
    private String sound;
    private int soundFrequency;
    private final ArrayList<Human> humans;
    private final ArrayList<Thing> things;

    public Room(String smell, String sound, int soundFrequency, ArrayList<Human> humans, ArrayList<Thing> things) {
        this.smell = smell;
        this.sound = sound;
        this.soundFrequency = soundFrequency > 0 ? soundFrequency : 1;
        this.humans = humans;
        this.things = things;
    }

    public int getSoundFrequency() {
        return soundFrequency;
    }

    public void setSoundFrequency(int soundFrequency) {
        if (soundFrequency > 0) {
            this.soundFrequency = soundFrequency;
        }
    }

    public Human getHumanByIndex(int index) {
        return this.humans.get(index);
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
                " на частоте " + this.soundFrequency +
                ", " + this.humans.size() + " людей" +
                " и " + this.things.size() + " существ";
    }
}
