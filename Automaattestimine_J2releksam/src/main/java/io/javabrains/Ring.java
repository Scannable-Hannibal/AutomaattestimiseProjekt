package io.javabrains;

public class Ring {

    double raadius;
    int varv; //sample int hexValue1 = 0xFFF0FFF0;

    double leiaPindla(double raadius){

        return Math.PI * Math.pow(raadius, 2);
    }

    double leiaUmbermoot(double raadius){

        return Math.PI * (2 * raadius);
    }
}
