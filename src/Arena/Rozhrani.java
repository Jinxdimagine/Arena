package Arena;
import Arena.Rasy.*;
import Arena.Tridy.*;

public class Rozhrani {

    void levelup(Postava postava) {
      if (postava.getZkusenosti()>=postava.getLevel()*100){
          postava.setZkusenosti((int) (postava.getZkusenosti()-postava.getLevel()*100));
          postava.setLevel(postava.getLevel()+1);
      }
    }

    public String start() {
        return "Vitej hraci v Arene v tuhle chvili jsi vyber sve jmeno";
    }

    public String Trida() {
        return """
                Nyni jsi muzete vybrat Tridu:
                1)Valecnik (Prida +3 sila)
                2)Tridy.Mag (Prida +3 inteligence)
                3)Tridy.Pruzkumnik (Prida +3 obratnost)""";
    }
    public String Rasa(){
        return """
                Nyni jsi vyberte Rasu
                1)clovek (+3% síla, +3% inteligence, +4% obratnost )
                2)elf (+6% inteligence, +4% obratnost)
                3)trpaslík (+7% síla, +3% odolnost)
                4)troll (+10% síla)
                5)temný elf (+4% inteligence, +6% obratnost)
                6)nemrtví (+10% inteligence)""";
    }

    public Postava vyberTridy(String jmeno, int vyber) {
        return switch (vyber) {
            case 1 -> new Valecnik(jmeno);
            case 2 -> new Mag(jmeno);
            case 3 -> new Pruzkumnik(jmeno);
            default -> null;
        };
    }
    void vyberRasy(Postava postava,int vyber){
        switch (vyber){
            case 1:postava.setTypRasy(new Clovek());
            case 2:postava.setTypRasy(new Elf());
            case 3:postava.setTypRasy(new Trpaslik());
            case 4:postava.setTypRasy(new Troll());
            case 5:postava.setTypRasy(new ElfT());
            case 6:postava.setTypRasy(new Nemrtvi());
        }
        postava.update();
    }
}
