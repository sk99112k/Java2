package calcapp.main;
import calcapp.logics.CalcLogic; //CalaLogicという表記があったら、calcapp.logics.CalcLogicのことだと解釈しなさいという意味
//import calcapp.logics.*;  //calcapp.logicsパッケージに属するすべてのクラスをインポートしたい場合
public class Cala {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = CalcLogic.tasu(a, b); //FQCNでなくてもエラーにならない
    int delta = calcapp.logics.CalcLogic.hiku(a, b); //FQCNを指定しても良い
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}

//実行するときはmainメソッドが含まれるクラスの名前を指定する必要がある