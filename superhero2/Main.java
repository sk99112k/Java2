import 練習問題10.Hero;
import 練習問題10.Matango;

public class Main {
  public static void main(String[] args) {
    Hero h = new Hero("みなと");
    Matango m = new Matango('A');
    SuperHero sh = new SuperHero("アサカ");

    h.attack(m);
    m.run();
    h.run();
    sh.land();
    sh.run();
  }
}
