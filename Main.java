public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    Matango m = new Matango('A');

    h.attack(m);
    m.run();
    h.run();
  }
}
