public class Language {
    
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
 
 public void getInfo(){
     System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
 
 }
  public static void main(String[] args) {
 Language urdu = new Language("urdu", 10000000, "east", "subject-verb-object");
 Language punjabi = new Language("punjabi", 10000000, "east", "subject-verb-object");
    mayan tzotzil = new mayan("Tzotzil", 404704);

SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
  mandarin.getInfo();
  SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
  burmese.getInfo();
    
   // urdu.getInfo();
   // punjabi.getInfo();
    //tzotzil.getInfo();
    
  }
  
}
