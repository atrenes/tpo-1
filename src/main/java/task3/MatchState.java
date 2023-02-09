package task3;

public enum MatchState {
    LIT("горит"),
    OFF("не горит");

    private final String message;
    MatchState(String message) {
        this.message = message;

    }
}
