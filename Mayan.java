public class Mayan extends Language {
    // Constructor for Mayan languages
    Mayan(String name, int speakers) {
        super(name, speakers, "Central America", "verb-object-subject");
    }

    // Print method for Mayan languages, overrides parent class mmethod
    @Override
    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken
                + ". The language follows the word order: " + this.wordOrder + ".");
        System.out.println("Fun Fact: " + this.name + " is an ergative language.");
    }
}