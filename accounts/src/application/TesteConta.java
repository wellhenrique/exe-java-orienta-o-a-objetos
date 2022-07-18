package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;

public class TesteConta {
  public static void main(String[] args) {
    System.out.println();
    ContaCorrente cc = new ContaCorrente(111, 111);
    cc.deposita(300.00);

    ContaPoupanca cp = new ContaPoupanca(222, 000);
    cp.deposita(120);

    cc.transfere(10.00, cp);
    System.err.println("CC: " + cc.getSaldo());
    System.out.println("CP: " + cp.getSaldo());
  }

}
