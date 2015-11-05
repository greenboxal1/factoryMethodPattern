package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Salvador on 17/10/2015.
 */
public class PozoleRojoPiernatest {
    Pozole pozole;

    @Test
    public void testName(){
        pozole = new PozoleRojoPierna();
        assertEquals("Pozole Rojo con Pierna", pozole.getName());
    }
}
