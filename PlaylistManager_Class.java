import java.util.ArrayList;
import java.util.Comparator;

class PlaylistManager {
    private GeneralPlaylist generalPlaylist;
    private FavoritesPlaylist favoritesPlaylist;

    public PlaylistManager() {
        generalPlaylist = new GeneralPlaylist();
        favoritesPlaylist = new FavoritesPlaylist();
    }

    public void addSongToGeneral(Song song) {
        generalPlaylist.addSong(song);
    }

    public void addSongToFavorites(Song song) {
        favoritesPlaylist.addSong(song);
    }

    public void removeSongFromGeneral(String title) {
        generalPlaylist.removeSong(title);
    }

    public void removeSongFromFavorites(String title) {
        favoritesPlaylist.removeSong(title);
    }

    public void sortSongsBy(Comparator<Song> comparator) {
        generalPlaylist.getSongs().sort(comparator);
        favoritesPlaylist.getSongs().sort(comparator);
    }

    public GeneralPlaylist getGeneralPlaylist() {
        return generalPlaylist;
    }

    public FavoritesPlaylist getFavoritesPlaylist() {
        return favoritesPlaylist;
    }
}
