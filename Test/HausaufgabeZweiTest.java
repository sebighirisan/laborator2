import com.company.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class HausaufgabeZweiTest {

    Benutzer benutzer;
    Basketball s1;
    Fussball s2;
    List<Sport> list;


    @BeforeEach
    void setUp(){
        benutzer = new Benutzer();
        s1 = new Basketball();
        s2 = new Fussball();
        list = new ArrayList<>();
    }

    @Test
    void testMainPositive() throws Exception{

        list.add(s1);
        list.add(s2);
        benutzer.setSport(list);

        assertEquals(benutzer.kalkuliereZeit(), 120);
        assertEquals(benutzer.kalkuliereZeit(s1), 55);
        assertEquals(benutzer.kalkuliereDurchschnittszeit(), 60);
    }

    @Test
    void testMainNegative() throws Exception{

        list.add(s1);
        list.add(s2);
        benutzer.setSport(list);

        assertFalse(benutzer.kalkuliereZeit() == 189);
        assertFalse(benutzer.kalkuliereZeit(s1) == -89314);
        assertFalse(benutzer.kalkuliereDurchschnittszeit() == 84.9421);
    }

}
