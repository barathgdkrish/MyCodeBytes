package computer;

public class Resolution {
	private int width;
	private int height;
	protected Resolution(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
}
