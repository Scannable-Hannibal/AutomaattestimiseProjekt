package io.javabrains;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

public class KolmnurkTest {

    Kolmnurk kolmnurk;

    @BeforeEach
    void init(){
        kolmnurk = new Kolmnurk();
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    void getUmbermoot_normalValues(){
        double samplekuljePikkus1 = 3.0;
        double samplekuljePikkus2 = 3.0;
        double samplekuljePikkus3 = 3.0;
        double expected = 9.0;
        double actual = kolmnurk.leiaUmbermoot(samplekuljePikkus1, samplekuljePikkus2, samplekuljePikkus3 );

        assertEquals(expected, actual);
    }

    @Test
    void getUmbermoot_Zero(){
        double samplekuljePikkus1 = 0;
        double samplekuljePikkus2 = 0;
        double samplekuljePikkus3 = 0;
        double expected = 0;
        double actual = kolmnurk.leiaUmbermoot(samplekuljePikkus1, samplekuljePikkus2, samplekuljePikkus3);

        assertEquals(expected, actual);
    }

    @Test
    void getUmbermoot_negValue(){
        double samplekuljePikkus1 = -3.0;
        double samplekuljePikkus2 = -3.0;
        double samplekuljePikkus3 = -3.0;
        double expected = -9.0;
        double actual = kolmnurk.leiaUmbermoot(samplekuljePikkus1, samplekuljePikkus2, samplekuljePikkus3);

        assertEquals(expected, actual);
    }
/*
    @Test
    // ei suutnud v2lja m6elda kuidas seda testi tööle saada.
    void getUmbermoot_radIsString(){
        String samplekuljePikkus1 = "kana";
        String samplekuljePikkus2 = "kana";
        String samplekuljePikkus3 = "kana";
        double expected = 18.84955592153876; // expect input error
        double actual = kolmnurk.leiaUmbermoot(samplekuljePikkus1, samplekuljePikkus2, samplekuljePikkus3);

        assertEquals(expected, actual);
    }

 */

    @Test
    void getPindala_normalValues(){
        double samplekuljePikkus1 = 3.0;
        double samplekuljePikkus2 = 3.0;
        double samplekuljePikkus3 = 3.0;
        double expected = 3.897114317029974;
        double actual = kolmnurk.leiaPindla(samplekuljePikkus1, samplekuljePikkus2, samplekuljePikkus3);

        assertEquals(expected, actual);
    }

    @Test
    void getPindala_zero(){
        double samplekuljePikkus1 = 0;
        double samplekuljePikkus2 = 0;
        double samplekuljePikkus3 = 0;
        double expected = 0;
        double actual = kolmnurk.leiaPindla(samplekuljePikkus1, samplekuljePikkus2, samplekuljePikkus3);

        assertEquals(expected, actual);
    }

    @Test
    void getPindala_negValues(){
        double samplekuljePikkus1 = -3.0;
        double samplekuljePikkus2 = -3.0;
        double samplekuljePikkus3 = -3.0;
        double expected = 3.897114317029974;
        double actual = kolmnurk.leiaPindla(samplekuljePikkus1, samplekuljePikkus2, samplekuljePikkus3);

        assertEquals(expected, actual);
    }

    /*
    // ei suutnud v2lja m6elda kuidas seda testi tööle saada.
    @Test
    void getPindala_radIsString(){
        String samplekuljePikkus1 = "kana";
        String samplekuljePikkus2 = "kana";
        String samplekuljePikkus3 = "kana";
        double expected = 28.274333882308138;
        double actual = kolmnurk.leiaPindla(samplekuljePikkus1, samplekuljePikkus2, samplekuljePikkus3);

        assertEquals(expected, actual);
    }

     */
}
