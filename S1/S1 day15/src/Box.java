/**
 * @author RYX
 */
public class Box {
	private int height;
	private int width;
	private int length;
	private int volume;

	public Box() {
	}

	public Box(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public void print(){
		System.out.println("体积为"+volume);
	}
	public int calcVolume(){
		this.volume = getHeight()*getWidth()*getLength();
		return volume;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getVolume() {
		return volume;
	}

}
