package co.devatwork.artisttest;

import co.devatwork.artist.Artist;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistTest {

    @Test
    public void shouldProvideArtistName(){

        Artist testArt = new Artist("Blanka",
                "Afro-soul",
                "Cape Town",
                "Get Physical");

        String request = testArt.getArtistName();
        String response = "Blanka";
        assertEquals(response,request);
    }

    @Test
    public void shouldProvideArtistGenre(){

        Artist testArt = new Artist("Blanka",
                "Afro-soul",
                "Cape Town",
                "Get Physical");

        String request = testArt.getGenreOfMusic();
        String response = "Afro-soul";
        assertEquals(response,request);
    }

    @Test
    public void shouldProvideArtistCity(){

        Artist testArt = new Artist("Blanka",
                "Afro-soul",
                "Cape Town",
                "Get Physical");

        String request = testArt.getCity();
        String response = "Cape Town";
        assertEquals(response,request);
    }

    @Test
    public void shouldProvideArtistRecordLabel(){

        Artist testArt = new Artist("Blanka",
                "Afro-soul",
                "Cape Town",
                "Get Physical");

        String request = testArt.getRecordLabel();
        String response = "Get Physical";
        assertEquals(response,request);
    }

}
