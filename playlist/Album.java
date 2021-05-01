package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public String getName() {
		return name;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public String getArtist() {
		return artist;
	}
	protected Album(String name, String artist) {
		this.artist = artist;
		this.name = name;
		this.songs = new ArrayList<Song>();
	}
	public boolean addSong(String title, double duration ) {
		if(this.findSong(title)==null) {
			this.songs.add(new Song(title,duration));
			return true;
		}
		return false;
	}
	private Song findSong(String title) {
		for(int i=0; i<this.songs.size();i++) {
			if(this.songs.get(i).getTitle().equals(title)) {
				return this.songs.get(i);
			}
		}
		return null;
	}
	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		int index = trackNumber-1;
		if(index>=0 && (index<=this.songs.size())) {
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("The Album does not have this track");
		return false;
	}
	public boolean addToPlayList(String title, LinkedList<Song> playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song "+title+" is not in the album");
		return false;
	}
	
}
