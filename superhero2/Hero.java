public class Hero {
  String name;
  int hp;

  public Hero(String name) {
    this.name = name;
    this.hp = 100;
  }
  //戦う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた。");
  }
  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した");
  }
}
