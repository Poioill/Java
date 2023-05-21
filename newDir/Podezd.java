public class Podezd {
    private final double draft;
    private final int crew;

    public Podezd(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        float c = (float) (draft - crew * 1.5);
        return (c > 20);
    }

}
