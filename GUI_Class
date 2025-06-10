import javax.swing.*;
import java.awt.*;
import java.util.Comparator;

class PlaylistApp {
    private PlaylistManager playlistManager;

    public PlaylistApp() {
        playlistManager = new PlaylistManager();
    }

    public void createGUI() {
        JFrame frame = new JFrame("Music Playlist Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Music Playlist Manager", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 24));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JButton addSongButton = new JButton("Add Song");
        JButton removeSongButton = new JButton("Remove Song");
        JButton viewGeneralButton = new JButton("View General Playlist");
        JButton viewFavoritesButton = new JButton("View Favorites Playlist");
        JButton sortButton = new JButton("Sort Songs");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 10, 10));
        buttonPanel.add(addSongButton);
        buttonPanel.add(removeSongButton);
        buttonPanel.add(viewGeneralButton);
        buttonPanel.add(viewFavoritesButton);
        buttonPanel.add(sortButton);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        addSongButton.addActionListener(e -> addSong());
        removeSongButton.addActionListener(e -> removeSong());
        viewGeneralButton.addActionListener(e -> viewPlaylist(playlistManager.getGeneralPlaylist()));
        viewFavoritesButton.addActionListener(e -> viewPlaylist(playlistManager.getFavoritesPlaylist()));
        sortButton.addActionListener(e -> sortSongs());

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void addSong() {
        String title = JOptionPane.showInputDialog("Enter Song Title:");
        String artist = JOptionPane.showInputDialog("Enter Artist:");
        String genre = JOptionPane.showInputDialog("Enter Genre:");
        int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Duration (in seconds):"));

        Song song = new Song(title, artist, genre, duration);
        playlistManager.addSongToGeneral(song);

        int addToFavorites = JOptionPane.showConfirmDialog(null, "Add to Favorites?");
        if (addToFavorites == JOptionPane.YES_OPTION) {
            playlistManager.addSongToFavorites(song);
        }
    }

    private void removeSong() {
        String title = JOptionPane.showInputDialog("Enter the title of the song to remove:");
        playlistManager.removeSongFromGeneral(title);
        playlistManager.removeSongFromFavorites(title);
    }

    private void viewPlaylist(Playlist playlist) {
        StringBuilder playlistDetails = new StringBuilder();
        for (Song song : playlist.getSongs()) {
            playlistDetails.append(song).append("\n");
        }
        JOptionPane.showMessageDialog(null, playlistDetails.toString());
    }

    private void sortSongs() {
        String[] options = {"Title", "Artist", "Genre", "Duration"};
        String choice = (String) JOptionPane.showInputDialog(null, "Sort by:", "Sort Songs",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (choice) {
            case "Title" -> playlistManager.sortSongsBy(Comparator.comparing(Song::getTitle));
            case "Artist" -> playlistManager.sortSongsBy(Comparator.comparing(Song::getArtist));
            case "Genre" -> playlistManager.sortSongsBy(Comparator.comparing(Song::getGenre));
            case "Duration" -> playlistManager.sortSongsBy(Comparator.comparingInt(Song::getDuration));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PlaylistApp app = new PlaylistApp();
            app.createGUI();
        });
    }
}
