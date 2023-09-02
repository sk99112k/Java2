package calcapp.main;
public class Cala {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = calcapp.logics.CalcLogic.tasu(a, b);
    int delta = calcapp.logics.CalcLogic.hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}

//実行するときはmainメソッドが含まれるクラスの名前を指定する必要がある