package test6;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Main obj=new Main();
		obj.fun1();
	}

	private void fun1(){
		JFrame jframe=new JFrame();
		System.out.println(jframe.getParent());
	}
}
