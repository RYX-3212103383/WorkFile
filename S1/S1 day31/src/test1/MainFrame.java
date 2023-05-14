package test1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
	public MainFrame(){
		setTitle("作业1");
		setResizable(true);
		setSize(400, 300);
		setLayout(new BorderLayout());


		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);

		String[] cols1 = {"序号","姓名","语文","数学","英语","总分"};
		String[][] data1 = {
				{"1","张三","80","80","|80","240"},
				{"2","John","70","80","90","240"},
				{"3","Sue","70","70","70","210"},
				{"4","Jane","80","70","60","210"},
				{"5","Joe_05","80","70","60","210"},
				{"6","Joe_06","80","70","60","210"},
				{"7","Joe_07","80","70","60","210"},
				{"8","Joe_08","80","70","60","210"},
				{"5","Joe_05","80","70","60","210"},
				{"6","Joe_06","80","70","60","210"},
				{"7","Joe_07","80","70","60","210"},
				{"8","Joe_08","80","70","60","210"},
				{"5","Joe_05","80","70","60","210"},
				{"6","Joe_06","80","70","60","210"},
				{"7","Joe_07","80","70","60","210"},
				{"8","Joe_08","80","70","60","210"},
				{"5","Joe_05","80","70","60","210"},
				{"6","Joe_06","80","70","60","210"},
				{"7","Joe_07","80","70","60","210"},
				{"8","Joe_08","80","70","60","210"}
		};
		JTable table1 = new JTable(data1, cols1);
		table1.setRowHeight(24);
		table1.setForeground(Color.BLUE);
		table1.setFont (new Font(null,0, 16));
		table1.setSelectionForeground(Color.DARK_GRAY);
		table1.setSelectionBackground(Color.LIGHT_GRAY);
		table1.setGridColor(Color.CYAN);

		JScrollPane scrollPanel1 = new JScrollPane(table1);
		panel1.add(scrollPanel1);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
