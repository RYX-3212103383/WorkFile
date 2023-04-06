/**
 * @author RYX
 */
public class Test7 {
	public static void main(String[] args) {
		int ram = (int) (Math.random() * ((60 - 1 + 1) + 1));
		String ganzhi = null;
		String shengxiao = null;
		switch (ram % 10) {
			case 1:
				ganzhi = "甲";
				break;
			case 2:
				ganzhi = "乙";
				break;
			case 3:
				ganzhi = "丙";
				break;
			case 4:
				ganzhi = "丁";
				break;
			case 5:
				ganzhi = "戊";
				break;
			case 6:
				ganzhi = "己";
				break;
			case 7:
				ganzhi = "庚";
				break;
			case 8:
				ganzhi = "戌";
				break;
			case 9:
				ganzhi = "壬";
				break;
			case 0:
				ganzhi = "癸";
				break;
		}
		switch (ram % 12) {
			case 1:
				shengxiao = "子鼠";
				break;
			case 2:
				shengxiao = "丑牛";
				break;
			case 3:
				shengxiao = "寅虎";
				break;
			case 4:
				shengxiao = "卯兔";
				break;
			case 5:
				shengxiao = "辰龙";
				break;
			case 6:
				shengxiao = "巳蛇";
				break;
			case 7:
				shengxiao = "午马";
				break;
			case 8:
				shengxiao = "未羊";
				break;
			case 9:
				shengxiao = "申猴";
				break;
			case 10:
				shengxiao = "酉鸡";
				break;
			case 11:
				shengxiao = "戌狗";
				break;
			case 0:
				shengxiao = "亥猪";
				break;
		}
		System.out.println("电脑随机数为" + ram + "\t对应天干地支年份为" + ganzhi + shengxiao + "年");
	}
}
