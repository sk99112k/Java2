import 練習問題10.Hero;

public class SuperHero extends Hero {
  boolean flying;
  public SuperHero(String name) {
    super(name); //superをつけることで親クラスHeroのコンストラクタを呼び出す
    this.flying = false; // 初期値は飛んでいない状態
  }
  //飛ぶ
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった");
  }
  //着地する
  public void land() {
    this.flying = false;
    System.out.println("着地した");
  }
  //撤退する
  //Heroにもrunはあるが、子クラスのSuperHeroでも再度runを定義する
  public void run() {
    System.out.println(this.name + "は、撤退した！");
  }
}
