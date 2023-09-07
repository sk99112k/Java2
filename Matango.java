public class Matango {
  int hp;
  final int LEVEL = 10; //定数フィールド（値を書き換えることができない。）名前は大文字で記述する。
  char suffix;
  public void run() {
    System.out.println("お化けきのこ" + this.suffix + "は、逃げ出した。");
  }

  public Matango(char suffix) {
    this.hp = 50;
  }
}
