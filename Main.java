public class Main {
  public static void main (String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h = new Hero(); //勇者を生成し初期化
    h.name = "みなと";
    h.hp = 100;
    h.sword = s;
    System.out.println("現在の武器は" + h.sword.name);

    Matango m1 = new Matango(); //お化けきのこ1匹目を生成し初期化
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango(); //お化けきのこ2匹目を生成し初期化
    m2.hp = 48;
    m2.suffix = 'B';

    //冒険の始まり
    h.slip(); //勇者は転ぶ
    m1.run(); //お化けきのこAが逃げる
    m2.run(); //お化けきのこBも逃げる
    h.run(); //勇者も逃げる
  }
}
