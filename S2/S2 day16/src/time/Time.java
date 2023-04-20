package time;

public class Time {
	private int mHour;
	private int mMinute;
	private int mSecond;

	public Time() {
	}

	public Time(int mHour) {
		this.mHour = mHour;
	}

	public Time(int mHour, int mMinute) {
		this.mHour = mHour;
		this.mMinute = mMinute;
	}

	public Time(int mHour, int mMinute, int mSecond) {
		this.mHour = mHour;
		this.mMinute = mMinute;
		this.mSecond = mSecond;
	}

	public void printTime() {
		System.out.println(mHour + ":" + mMinute + ":" + mSecond);
	}
}
