package test3;

public class DrinkNotFoundException extends Exception{
	public DrinkNotFoundException(){
		super("对不起！没有您输入的饮料类型");
	}
}
