public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    // Language constructor method:

    public Language(String name, int speakers, String regions, String order) {
        this.name = name;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = order;
    }

    // Print method for languages
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + numSpeakers + " people mainly in " + this.regionsSpoken
                + ". The language follows word order: " + this.wordOrder + ".");
    }

    // Languages main method
    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 555000000, "Spain and Latin America", "subject-verb-object");
        spanish.getInfo();
        Language danish = new Language("Danish", 6000000, "Denmark", "subject-verb-object");
        danish.getInfo();
        Mayan kiche = new Mayan("Ki'che'", 2330000);
        kiche.getInfo();
        SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 920000000);
        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        mandarinChinese.getInfo();
        burmese.getInfo();

    }
}