package co.devatwork.artist;

public class Artist {

    private String artistName;
    private String genreOfMusic;
    private String city;
    private String recordLabel;

    //constructors
    public Artist(){
        super();
    }

    public Artist(String name, String genreOfMusic, String city, String recordLabel){
        this.artistName = name;
        this.genreOfMusic = genreOfMusic;
        this.city = city;
        this.recordLabel = recordLabel;

    }

    public String getArtistName(){
        return artistName;
    }

    public String getGenreOfMusic() {
        return genreOfMusic;
    }


    public String getCity() {
        return city;
    }


    public String getRecordLabel() {
        return recordLabel;
    }

    //methods
    //check bookings made for a time period
    //accepts booking made by interested parties
    //rejects booking made by interested party

}
