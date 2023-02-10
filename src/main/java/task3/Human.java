package task3;

public class Human {
    public Human(int personId, String name, String sex, String action) {
        this.personId = personId;
        this.name = name;
        this.sex = sex;
        this.action = action;
    }

    private final int personId;
    private final String name;
    private final String sex;
    private String action;
    private Match match = null;

    public Match getMatch() {
        return this.match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean canThink(int soundFrequency) {
        return !(soundFrequency > 0 && soundFrequency <= 200);
    }

    @Override
    public String toString() {
        return  "id: " + this.personId +
                ", имя: " + this.name +
                ", пол: " + this.sex +
                ", делает: " + this.action +
                (this.match == null ? ", не держит спичку" : ", держит спичку которая " + this.match);
    }
}
