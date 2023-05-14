package test5;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

public class MainFrame extends JFrame {
	JTree root = new JTree();
	DefaultTreeModel dtm = null;

	public MainFrame() {
		setTitle("作业5");
		setResizable(true);
		setSize(400, 300);
		setLayout(new BorderLayout());

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		DefaultMutableTreeNode rootnode = new DefaultMutableTreeNode("华瑞");
		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("java107");
		rootnode.add(node1);
		DefaultMutableTreeNode node10 = new DefaultMutableTreeNode("班长");
		node1.add(node10);
		DefaultMutableTreeNode node11 = new DefaultMutableTreeNode("学生");
		node1.add(node11);
		DefaultMutableTreeNode node111 = new DefaultMutableTreeNode("朱军");
		DefaultMutableTreeNode node112 = new DefaultMutableTreeNode("谭昊");
		DefaultMutableTreeNode node113 = new DefaultMutableTreeNode("唐宇轩");
		DefaultMutableTreeNode node114 = new DefaultMutableTreeNode("李广阔");
		DefaultMutableTreeNode node115 = new DefaultMutableTreeNode("冉渝湘");
		node11.add(node111);
		node11.add(node112);
		node11.add(node113);
		node11.add(node114);
		node11.add(node115);
		DefaultMutableTreeNode node12 = new DefaultMutableTreeNode("学习委员");
		node1.add(node12);
		DefaultMutableTreeNode node13 = new DefaultMutableTreeNode("老师");
		node1.add(node13);
		DefaultMutableTreeNode node121 = new DefaultMutableTreeNode("汤永红");
		DefaultMutableTreeNode node122 = new DefaultMutableTreeNode("马盼");
		node13.add(node121);
		node13.add(node122);
		dtm = new DefaultTreeModel(rootnode);
		root.setModel(dtm);
		panel.add(root, BorderLayout.CENTER);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
