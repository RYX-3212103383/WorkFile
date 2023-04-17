import java.util.Scanner;

/**
 * @author RYX
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("你是妹妹吗?是/不是");
		String name = sc.next();
		if("是".equals(name)){
			System.out.println("请问芳龄");
			int age = sc.nextInt();
			if(age>=0&&age<18||age>25){
				System.out.println("对不起，打扰了！");
			}else if(age>=18&&age<=25){
				System.out.println("是否有男朋友吗?有/没有");
				String reply = sc.next();
				if("有".equals(reply)){
					System.out.println("那还算了,祝你幸福");
				}else if("没有".equals(reply)){
					System.out.println("呵呵, 能做你男朋友吗？");
				}else{
					System.out.println(reply);
					System.out.println("输入有误,已退出");
				}
			}else{
				System.out.println("年龄不能为负数");
			}
		}else if("不是".equals(name)){
			System.out.println("你好，兄弟！！！");
		}else{
			System.out.println("性别未知,已退出");
		}
	}
}
