package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Salvador on 17/10/2015.
 */
public class PozoleRojoStoreTest {
    Pozole pozole;
    Pozole pozole1;
    PozoleStore pozoleStore;

    @Before
    public void setUp(){
        pozoleStore = new PozoleRojoStore();
    }

    @Test
    public void testWithCachete(){
        pozole = new PozoleRojoCachete();
        pozole1 = pozoleStore.orderPozole("cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithEspinazo(){
        pozole = new PozoleRojoEspinazo();
        pozole1 = pozoleStore.orderPozole("espinazo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithLomo(){
        pozole = new PozoleRojoLomo();
        pozole1 = pozoleStore.orderPozole("lomo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithOreja(){
        pozole = new PozoleRojoOreja();
        pozole1 = pozoleStore.orderPozole("oreja");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPierna(){
        pozole = new PozoleRojoPierna();
        pozole1 = pozoleStore.orderPozole("pierna");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPollo(){
        pozole = new PozoleRojoPollo();
        pozole1 = pozoleStore.orderPozole("pollo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithTrompa(){
        pozole = new PozoleRojoTrompa();
        pozole1 = pozoleStore.orderPozole("trompa");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testWithException(){
        pozole = new PozoleRojoTrompa();
        pozole1 = pozoleStore.orderPozole("");
        assertEquals(pozole.getName(), pozole1.getName());
    }
}
