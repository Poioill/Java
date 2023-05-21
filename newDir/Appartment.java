public class Appartment extends House {
    private int Anumber, Afloor;
    private float Big;

    public Appartment(int number, int year, int level, String strasse) {
        super(number, year, level, strasse);
    }

    public void setAppartment(int number, int floor, float big) {
        this.Afloor = floor;
        this.Anumber = number;
        this.Big = big;
    }

    public String getAppartment() {
        String sentence = "";
        sentence = "This is appartment number " + Anumber + " on a " + Afloor + " floor. It is " + Big + " kvadrometres.\n";
        return sentence;
    }
}
