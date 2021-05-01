package playlist;

public class Song {
	private String title;
	private double duration;
	public String getTitle() {
		return title;
	}
	public double getDurationInMinutes() {
		return duration;
	}
	protected Song(String songName, double durationInMinutes2) {
		this.title = songName;
		this.duration = durationInMinutes2;
	}
	public String toString() {
		return this.title+": "+this.duration;
	}
}
