package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Salvador on 17/10/2015.
 */
public class MenudoStoreTest {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Test
    public void testMenudoStore(){
        pozoleStore = new MenudoStore();
        pozole = pozoleStore.orderPozole("");
        assertEquals("Menudo", pozole.getName());
    }
}
