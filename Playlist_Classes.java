import java.util.ArrayList;

abstract class Playlist {
    protected ArrayList<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public abstract void displayPlaylistDetails();
}

class GeneralPlaylist extends Playlist {
    @Override
    public void displayPlaylistDetails() {
        System.out.println("General Playlist:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}

class FavoritesPlaylist extends Playlist {
    @Override
    public void displayPlaylistDetails() {
        System.out.println("Favorites Playlist:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
