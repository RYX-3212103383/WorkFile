package test2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Vector;

public class MainFrame extends JFrame {
	public MainFrame() {

		setTitle("作业2");
		setResizable(true);
		setSize(400, 300);
		setLayout(new BorderLayout());


		Vector cols = new Vector();
		Vector rows = new Vector();
		Vector v1 = new Vector();
//准备数据
		{
			cols.add("学号");
			cols.add("姓名");
			cols.add("年龄");
			cols.add("电话");
			v1.add("01");
			v1.add("张三");
			v1.add("21");
			v1.add("111");
			Vector v2 = new Vector();
			v2.add("02");
			v2.add("李四");
			v2.add("22");
			v2.add("222");
			Vector v3 = new Vector();
			v3.add("03");
			v3.add("王五");
			v3.add("23");
			v3.add("333");
			rows.add(v1);
			rows.add(v2);
			rows.add(v3);
		}
		JPanel panel3 = new JPanel();
		panel3.setLayout(new BorderLayout());
		add(panel3, BorderLayout.CENTER);
		DefaultTableModel dtm = new DefaultTableModel();
		JTable table3 = new JTable();
		table3.setModel(dtm);
		dtm.setDataVector(rows, cols);
		JScrollPane scrollPanel3 = new JScrollPane();
		scrollPanel3.setViewportView(table3);
		panel3.add(scrollPanel3);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		table3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = table3.getSelectedRow();
				int length = table3.getRowCount();
				String[] a = new String[length];
				for (int i = 0; i < length; i++) {
					a[i] = (String) table3.getValueAt(index, i);
				}
				System.out.println(Arrays.toString(a));
			}
		});

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
