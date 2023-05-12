import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GetPropertiesFrame extends JFrame {
	public GetPropertiesFrame() {
		setTitle("获取属性");
		setResizable(true);
		setSize(400, 800);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(12, 1));

		JLabel[] lbl = new JLabel[11];
		JTextField[] textFields = new JTextField[8];
		JPanel[] panels = new JPanel[12];
		JCheckBox[] box = new JCheckBox[4];
		box[0] = new JCheckBox("游戏       ");
		box[1] = new JCheckBox("编码       ");
		box[2] = new JCheckBox("运动       ");
		box[3] = new JCheckBox("                                                                  ");
		JComboBox cob = new JComboBox();
		cob.addItem("请选择                                                     ");
		cob.addItem("大专");
		cob.addItem("本科");
		cob.addItem("研究生");
		cob.addItem("博士");
		JButton[] btn = new JButton[2];
		btn[0] = new JButton("            注册            ");
		btn[1] = new JButton("            关闭            ");
		String[] str = {"编号    ", "学号    ", "姓名    ", "身份证", "爱好    ", "学历    ", "电话    ", "地址    ", "备注    ", "头像    ", "婚否    "};
		for (int i = 0, j = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
			add(panels[i]);
			panels[i].setLayout(new FlowLayout(FlowLayout.CENTER));
			if (i == 11) {
				continue;
			}
			if (i == 4 || i == 5 || i == 10) {
				lbl[i - j] = new JLabel(str[i]);
				panels[i].add(lbl[i - j]);
				j++;
				continue;
			}
			lbl[i - j] = new JLabel(str[i]);
			panels[i].add(lbl[i - j]);
			textFields[i - j] = new JTextField(20);
			panels[i].add(textFields[i - j]);
		}
		panels[4].add(box[0]);
		panels[4].add(box[1]);
		panels[4].add(box[2]);
		panels[5].add(cob);
		panels[10].add(box[3]);
		panels[11].add(btn[0]);
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> list=new ArrayList<>();
				String temp = "";
				list.add(textFields[0].getText());
				list.add(textFields[1].getText());
				list.add(textFields[2].getText());
				list.add(textFields[3].getText());
				if(box[0].isSelected()){temp+="游戏";}
				if(box[1].isSelected()){temp+="编码";}
				if(box[2].isSelected()){temp+="运动";}
				list.add(temp);
				list.add((String) cob.getSelectedItem());
				list.add(textFields[4].getText());
				list.add(textFields[5].getText());
				list.add(textFields[6].getText());
				list.add(textFields[7].getText());
				if(box[3].isSelected()){
					temp="true";
				}else {
					temp="false";
				}
				list.add(temp);
				TestReaderAndWriter.writeProperties(list);
			}
		});
		panels[11].add(btn[1]);
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GetPropertiesFrame();
	}
}
