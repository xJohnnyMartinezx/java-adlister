package models;

import java.io.Serializable;
import java.time.LocalDate;

public class Albums implements Serializable {

//******* PROPERTIES ********
    private Long id;
    private String artist;
    private String recordName;
    private int releaseYear;
    private Double sales;
    private String genre;

//    ****** CONSTRUCTORS *******
//    ******* EMPTY *****
    public Albums() {}

    public Albums(Long id, String artist, String recordName, int releaseYear, Double sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.recordName = recordName;
        this.releaseYear = releaseYear;
        this.sales = sales;
        this.genre = genre;
    }

    //    ******* GETTER AND SETTERS


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseDate(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
