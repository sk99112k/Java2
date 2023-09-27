import 練習問題10.Matango;

public class Hero {
  String name;
  int hp;

  public Hero(String name) {
    this.name = name;
    this.hp = 100;
  }
  //転ぶ
  //finalとつけることで、slipメソッドは子クラスでオーバーライド禁止
  public final void slip() {
    this.hp -= 2;
    System.out.println("this.name" + "は、転んだ。");
    System.out.println("2ポイントのダメージを受けた");
  }
  //戦う
  //finalがついていないので、attackメソッドは子クラスでオーバーライド可能
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
