public class Main {
  public static void main(String[] args) {
    SuperHero h = new SuperHero();
    Matango m = new Matango('A');

    h.attack(m);
    m.run();
    h.run();
    h.fly();
    h.land();
  }
}
