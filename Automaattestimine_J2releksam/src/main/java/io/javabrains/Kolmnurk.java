package io.javabrains;

public class Kolmnurk implements Kuju {

    double kuljePikkus1;
    double kuljePikkus2;
    double kuljePikkus3;

    int varv; //sample int hexValue1 = 0xFFF0FFF0;

    double leiaPindla(double kuljePikkus1, double kuljePikkus2, double kuljePikkus3){

        double s = leiaUmbermoot(kuljePikkus1, kuljePikkus2, kuljePikkus3) / 2;
        return Math.sqrt(s * (s - kuljePikkus1) * (s - kuljePikkus2) * (s - kuljePikkus3));
    }

    double leiaUmbermoot(double kuljePikkus1, double kuljePikkus2, double kuljePikkus3){

        return kuljePikkus1 + kuljePikkus2 + kuljePikkus3;
    }

    // ei t66ta ilma setterita
    @Override
    public double umbermoot() {
        double s = leiaUmbermoot(kuljePikkus1, kuljePikkus2, kuljePikkus3) / 2;
        return Math.sqrt(s * (s - kuljePikkus1) * (s - kuljePikkus2) * (s - kuljePikkus3));
    }

    @Override
    public double pindala() {
        return kuljePikkus1 + kuljePikkus2 + kuljePikkus3;
    }
}
