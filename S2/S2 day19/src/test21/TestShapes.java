package test21;

import java.awt.*;

public class TestShapes {
	public static void main(String[] args) {
		Triagle tri= null;
		try {
			tri = new Triagle(10,4,3);
			tri.printDetail();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Circle cir=new Circle(10);
		Rectangle rec=new Rectangle(4,5);
		cir.printDetail();
		rec.printDetail();
	}
}
