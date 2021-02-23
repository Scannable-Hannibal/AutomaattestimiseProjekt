package io.javabrains;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

public class RingTest {

    Ring ring;

    @BeforeEach
    void init(){
        ring = new Ring();
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    void getUmbermoot_normalValues(){
        double sampleRaadius = 3.0;
        double expected = 18.84955592153876;
        double actual = ring.leiaUmbermoot(sampleRaadius);

        assertEquals(expected, actual);
    }

    @Test
    void getUmbermoot_radiusZero(){
        double sampleRaadius = 0;
        double expected = 0;
        double actual = ring.leiaUmbermoot(sampleRaadius);

        assertEquals(expected, actual);
    }

    @Test
    void getUmbermoot_negValue(){
        double sampleRaadius = -3.0;
        double expected = -18.84955592153876;
        double actual = ring.leiaUmbermoot(sampleRaadius);

        assertEquals(expected, actual);
    }

    /*
    // ei suutnud v2lja m6elda kuidas seda testi tööle saada.
    @Test
    void getUmbermoot_radIsString(){
        double sampleRaadius = Double.parseDouble("kana");
        exception.expect(IndexOutOfBoundsException.class); // NumberFormatException.class
        ring.leiaUmbermoot(sampleRaadius);
    }

    /*
    @Test
    public void doStuffThrowsIndexOutOfBoundsException() {
        IndexOutOfBoundsException e = assertThrows(
                IndexOutOfBoundsException.class, foo::doStuff);

        assertThat(e).hasMessageThat().contains("woops!"); // selleks on vaja Truth dependancy lisada ja importida
    }

     */

    @Test
    void getPindala_normalValues(){
        double sampleRaadius = 3.0;
        double expected = 28.274333882308138;
        double actual = ring.leiaPindla(sampleRaadius);

        assertEquals(expected, actual);
    }

    @Test
    void getPindala_zero(){
        double sampleRaadius = 0;
        double expected = 0;
        double actual = ring.leiaPindla(sampleRaadius);

        assertEquals(expected, actual);
    }

    @Test
    void getPindala_negValues(){
        double sampleRaadius = -3.0;
        double expected = 28.274333882308138;
        double actual = ring.leiaPindla(sampleRaadius);

        assertEquals(expected, actual);
    }

    // ei suutnud v2lja m6elda kuidas seda testi tööle saada.
    /*
    @Test
    public void getPindala_radIsString() {

        double sampleRaadius = Double.parseDouble("kana");
        exception.expect(IndexOutOfBoundsException.class);
        ring.leiaPindla(sampleRaadius);
    }
     */

}
