import java.io.Serializable;

class Song implements Serializable {
    private String title;
    private String artist;
    private String genre;
    private int duration;

    public Song(String title, String artist, String genre, int duration) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + genre + ", " + duration + " seconds)";
    }
}
