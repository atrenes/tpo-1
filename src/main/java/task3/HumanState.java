package task3;

public enum HumanState {
    STANDING("стоит"),
    LYING("лежит"),
    SITTING("сидит");

    private final String message;

    HumanState(String message){
        this.message = message;
    }

}
