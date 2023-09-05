package calcapp;


import calcapp.logics.CalcLogic;

public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = CalcLogic.tasu(a, b); //FQCNでなくてもエラーにならない
    int delta = CalcLogic.hiku(a, b); //FQCNを指定しても良い
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}

//import calcapp.logics.*;
//import calcapp.main.*;
//calcapp.logics と calcapp.main に所属するすべてのクラスをインポートしたい場合にはこのように記述する。


/* コンパイルエラーで解決できないので次行きます。*/