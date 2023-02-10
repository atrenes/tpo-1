package task3;

public class Thing{
    private final String name;
    private String description;

    public Thing(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "имя существа: " + this.name +
                ", характеристика: " + this.description;
    }
}
