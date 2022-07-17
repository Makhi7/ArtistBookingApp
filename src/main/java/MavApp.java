import co.devatwork.artist.Artist;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MavApp {

    static Scanner scanner;
    static String instruction;

    private static String getInput(String messagePrompt){
        System.out.println(messagePrompt);
        String input = scanner.nextLine();

        while(input.isBlank()){
            System.out.println(messagePrompt);
            input = scanner.nextLine();
        }
        return input;
    }


    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        scanner = new Scanner(System.in);
        Artist artist;

        //have a method that processes input made
        //by user

        String artistName = getInput("What is the artist name:");
        String genre = getInput("Which genre of music:");
        String city = getInput("Where are they based:");
        String recordLabel = getInput("Who are they signed too:");

        artist = new Artist(artistName,genre,city,recordLabel);

        //use ojectMapper to serialize artist details in Json
        objectMapper.writeValue(new File("target/artist.json"),artist);


        //use toString()
//        System.out.println("This is " + artist.getArtistName() +" profile.\n" +
//                "They play " + artist.getGenreOfMusic() + "  and are based at\n"
//        + artist.getCity() + " ." + artist.getArtistName() + " currently has a deal with\n "
//                + artist.getRecordLabel()+ " .");

    }
}
