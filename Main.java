public class Main {
  public static void main (String[] args) {
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;

    Hero h1 = new Hero(); //勇者を生成し初期化
    h1.name = "みなと";
    //h1.hp = 100;
    h1.sword = s;
    System.out.println("現在の武器は" + h1.sword.name);
    
    Hero h2 = new Hero();
    h2.name = "アサカ";
    //h2.hp = 100;

    Wizard w = new Wizard();
    w.name = "すがわら";
    w.hp = 50;

    Matango m1 = new Matango(); //お化けきのこ1匹目を生成し初期化
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango(); //お化けきのこ2匹目を生成し初期化
    m2.hp = 48;
    m2.suffix = 'B';

    w.heal(h1); //みなとを回復させる（HP:100→110）
    w.heal(h2); //アサカを回復させる（HP:100→110）
    w.heal(h2); //アサカを回復させる（HP:110→120）

    //冒険の始まり
    h1.slip(); //勇者は転ぶ
    h1.attack(); //勇者は攻撃する
    m1.run(); //お化けきのこAが逃げる
    m2.run(); //お化けきのこBも逃げる
    h1.run(); //勇者も逃げる
  }
}
