public class House {
    private int number, year, floor;
    private String strasse;

    public House(int number, int year, int level, String strasse) {
        System.out.println("The house number " + number);
        this.setValues(number, year, level, strasse);
        System.out.println(getValues());
    }

    public void setValues(int number, int year, int level, String strasse) {
        this.number = number;
        this.year = year;
        this.floor = level;
        this.strasse = strasse;
    }

    public String getValues() {
        String sentence = "";
        sentence = "This House was built in " + year + " year. It has " + floor + " floors and its number is " + number + ". This House places on " + strasse + " strasse.\n";
        return sentence;
    }
}
