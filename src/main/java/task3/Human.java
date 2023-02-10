package task3;

public class Human {
    public Human(Long personId, String name, String sex, HumanState state) {
        this.personId = personId;
        this.name = name;
        this.sex = sex;
        this.state = state;
    }

    private Long personId;
    private String name;
    private String sex;

    private HumanState state;

    public HumanState getState() {
        return state;
    }

    public Long getPersonId() {
        return personId;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
