package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Salvador on 17/10/2015.
 */
public class PozoleVerdeEspinazoTest {
    Pozole pozole;

    @Test
    public void testName(){
        pozole = new PozoleVerdeEspinazo();
        assertEquals("Pozole Verde con Espinazo", pozole.getName());
    }
}
