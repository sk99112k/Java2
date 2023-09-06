import java.util.Random;

public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid() {
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した。");
  }
  public int pray(int second) {
    System.out.print(this.name + "は、" + second +"秒間祈った。");
    int recover = new Random().nextInt(3) + second;
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した。");
    return recoverActual;
  }
}
