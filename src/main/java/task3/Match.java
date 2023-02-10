package task3;

public class Match {
    public Match() {
        this.isLit = false;
        this.isLightable = true;
    }

    private boolean isLit;
    private boolean isLightable;

    public boolean getIsLit() {
        return this.isLit;
    }

    public void fire() {
        if (isLightable) {
            this.isLit = true;
            this.isLightable = false;
        }
    }

    public void putOut() {
        if (isLit) {
            this.isLit = false;
            this.isLightable = false;
        }
    }

    @Override
    public String toString() {
        return this.isLit ? "горит" : "не горит";
    }
}
