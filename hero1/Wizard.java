import 練習問題10.Hero;

public class Wizard {
  String name;
  int hp;
  public void heal(Hero h1) {
    h1.hp += 10;
    System.out.println(h1.name + "のHPを10回復した!!");
  }
}
