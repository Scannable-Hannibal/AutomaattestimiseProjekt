package io.javabrains;

public class Ring implements Kuju {

    double raadius;
    int varv; //sample int hexValue1 = 0xFFF0FFF0;


    double leiaPindla(double raadius){

        return Math.PI * Math.pow(raadius, 2);
    }

    double leiaUmbermoot(double raadius){

        return Math.PI * (2 * raadius);
    }

    // ei t66ta ilma setterita
    @Override
    public double umbermoot() {
        return Math.PI * Math.pow(raadius, 2);
    }

    @Override
    public double pindala() {
        return Math.PI * (2 * raadius);
    }
}
