package pakagesDemo;

import pakagesDemo.matematik.DortIslem;
import pakagesDemo.matematik.Logaritma;

public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(5,5);
        dortIslem.cikar(5,5);
        dortIslem.carp(5,5);
        dortIslem.bol(5,5);

        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesap(100,10);
    }
}
