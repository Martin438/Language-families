class Language {
  
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

Language(String langName, int speakers, String regions, String wdOrder) { 
  this.name = langName;
  this.numSpeakers = speakers;
  this.regionsSpoken = regions;
  this.wordOrder = wdOrder;
}
public void getInfo() {
  
System.out.println(this.name + " is spoken by " + this.numSpeakers +  " people mainly in " + this.regionsSpoken + "." );
System.out.println("The language follows the word order: " + this.wordOrder);

}
public static void main(String[] args) {
Language france = new Language("France", 100000000, "Western Europe and North Africa", "subject, verb, object");
france.getInfo();

Mayan chontal = new Mayan("Chontal", 2330000);
chontal.getInfo();

SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1000000);
mandarin.getInfo();
SinoTibetan burmese = new SinoTibetan("Burmese", 1000000);
burmese.getInfo();
 }
}

$ java Language
France is spoken by 10000000 people mainly in Western Europe and North Africa.
The language follows the word order: subject, verb, object
Chontal is spoken by 2330000 people mainly in Central America.
The language follows the word order: verb-object-subject
Fun fact: Chontal is an ergative language.
Mandarin Chinese is spoken by 10000000 people mainly in Asia.
The language follows the word order: subject-verb-object
Burmese is spoken by 1000000 people mainly in Asia.
The language follows the word order: subject-object-verb
