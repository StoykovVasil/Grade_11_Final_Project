# Music Playlist Manager

## Description
The **Music Playlist Manager** is a Java application with a graphical user interface (GUI) that allows users to manage music playlists. It enables users to add, view, remove, and sort songs in two types of playlists: General Playlist and Favorites Playlist.

## Features
- Add songs with attributes such as title, artist, genre, and duration.
- View and manage two types of playlists:
  - General Playlist
  - Favorites Playlist
- Remove songs from either playlist.
- Sort playlists by:
  - Title
  - Artist
  - Genre
  - Duration

## Files
- **`GUI_Class.java`**: Contains the main application and GUI setup.
- **`Song_Class.java`**: Represents a song with attributes and methods.
- **`Playlist_Classes.java`**: Includes:
  - `Playlist` (abstract base class).
  - `GeneralPlaylist` (general playlist implementation).
  - `FavoritesPlaylist` (favorites playlist implementation).
- **`PlaylistManager_Class.java`**: Manages playlist operations such as adding, removing, and sorting songs.

## How to Run
1. Ensure all four files (`GUI_Class.java`, `Song_Class.java`, `Playlist_Classes.java`, and `PlaylistManager_Class.java`) are in the same directory.
2. Compile all the Java files:
   ```bash
   javac GUI_Class.java Song_Class.java Playlist_Classes.java PlaylistManager_Class.java
