import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;

public class newAdd extends JDialog {
	private final JLabel lblMsg = new JLabel("条形码:");
	private final JLabel lblSu = new JLabel("名 称:");
	private final JLabel lblFu = new JLabel("价 格:");
	private final JLabel lblDe = new JLabel("类 型:");
	private final JTextField txtLinecode = new JTextField();
	private final JTextField txtname = new JTextField();
	private final JTextField txtprice = new JTextField();
	private final JComboBox cbotype = new JComboBox();
	private final JLabel lblNum = new JLabel("数 量");
	private final JLabel lblWei = new JLabel("位 置:");
	private final JTextField txtNum = new JTextField();
	private final JComboBox cbolocation = new JComboBox();
	private final JButton btn1 = new JButton("提交");
	private final JButton btn2 = new JButton("取消");
	Vector v = new Vector();

	public newAdd(Vector rows, int id) {
		super();
		setTitle("用户管理->添加用户");
		setSize(560, 430);
		setLayout(null);
		setBackground(new Color(236, 240, 244));
		lblMsg.setBounds(150, 20, 50, 30);
		lblSu.setBounds(150, 70, 50, 30);
		lblFu.setBounds(150, 120, 50, 30);
		lblDe.setBounds(150, 170, 50, 30);
		txtLinecode.setBounds(200, 20, 200, 30);
		txtname.setBounds(200, 70, 200, 30);
		txtprice.setBounds(200, 120, 200, 30);
		cbotype.setBounds(200, 170, 200, 30);
		cbotype.addItem("保健品");
		cbotype.addItem("其他");
		cbotype.addItem("副食品");
		cbotype.addItem("文具");
		cbotype.addItem("日用品");
		cbotype.addItem("酒水");
		cbotype.addItem("食品");
		cbotype.addItem("饮料");
		cbotype.setBackground(new Color(246, 194, 123));
		lblNum.setBounds(150, 220, 50, 30);
		lblWei.setBounds(150, 270, 50, 30);
		txtNum.setBounds(200, 220, 200, 30);
		cbolocation.setBounds(200, 270, 200, 30);
		cbolocation.addItem("A1");
		cbolocation.addItem("A2");
		cbolocation.addItem("A3");
		cbolocation.addItem("B1");
		cbolocation.addItem("B2");
		cbolocation.addItem("B3");
		cbolocation.addItem("C1");
		cbolocation.setBackground(new Color(246, 194, 123));
		btn1.setBounds(325, 330, 100, 30);
		btn2.setBounds(435, 330, 100, 30);
		add(lblMsg);
		add(lblSu);
		add(lblFu);
		add(lblDe);
		add(txtLinecode);
		add(txtname);
		add(txtprice);
		add(cbotype);
		add(btn1);
		add(btn2);
		add(lblNum);
		add(txtNum);
		add(lblWei);
		add(cbolocation);
		setLocationRelativeTo(null);
		setVisible(true);
		//事件监听
		ImageIcon img = null;
		try {
			img = new ImageIcon(ImageIO.read(getClass().getResource("/img.png")));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		ImageIcon finalImg = img;
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int length = txtLinecode.getText().length() * txtname.getText().length() * txtprice.getText().length() * txtNum.getText().length();
				String msg = "请填写";
				if (length == 0) {
					if (txtLinecode.getText().length() == 0) {
						msg += "条形码 ";
					}
					if (txtname.getText().length() == 0) {
						msg += "名称 ";
					}
					if (txtprice.getText().length() == 0) {
						msg += "价格 ";
					}
					if (txtNum.getText().length() == 0) {
						msg += "数量";
					}
					msg += "!";

					JOptionPane.showMessageDialog(null, msg, null, JOptionPane.WARNING_MESSAGE, finalImg);

				}

				if (length != 0) {
					JOptionPane.showMessageDialog(null, "添加成功", "消息", JOptionPane.CANCEL_OPTION, finalImg);
					v.add(id);
					v.add(txtLinecode.getText());
					v.add(txtname.getText());
					v.add(txtprice.getText());
					v.add(cbotype.getSelectedItem());
					v.add(txtNum.getText());
					v.add(cbolocation.getSelectedItem());
					rows.add(v);
					dispose();
				}
			}

		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	public static void main(String[] args) {
		Goods goods = new Goods();
		new newAdd(goods.getRows2(), 2);
	}

	public Vector getV() {
		return v;
	}
}

