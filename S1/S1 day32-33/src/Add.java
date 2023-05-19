import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;

public class Add extends JDialog {
	Vector v = new Vector();
	private JLabel lblMsg = new JLabel("用户名");
	private JLabel lblSu = new JLabel("密码");
	private JLabel lblFu = new JLabel("姓名");
	private JLabel lblDe = new JLabel("权限");
	private JTextField txtName = new JTextField();
	private JTextField txtPass = new JTextField();
	private JTextField txtUserName = new JTextField();
	private JComboBox cbo = new JComboBox();
	private JButton btn1 = new JButton("确定");
	private JButton btn2 = new JButton("取消");

	public Add(Vector rows, int id) {
		super();
		setTitle("用户管理->添加用户");
		setSize(560, 430);
		setLayout(null);
		setBackground(new Color(236, 240, 244));
		lblMsg.setBounds(100, 50, 50, 30);
		lblSu.setBounds(100, 110, 50, 30);
		lblFu.setBounds(100, 170, 50, 30);
		lblDe.setBounds(100, 230, 50, 30);
		txtName.setBounds(200, 50, 200, 30);
		txtPass.setBounds(200, 110, 200, 30);
		txtUserName.setBounds(200, 170, 200, 30);
		cbo.setBounds(200, 230, 200, 30);
		cbo.addItem("收银员");
		cbo.addItem("仓库管理员");
		cbo.addItem("管理员");
		cbo.setBackground(new Color(246, 194, 123));
		btn1.setBounds(230, 300, 120, 30);
		btn2.setBounds(370, 300, 120, 30);
		add(lblMsg);
		add(lblSu);
		add(lblFu);
		add(lblDe);
		add(txtName);
		add(txtPass);
		add(txtUserName);
		add(cbo);
		add(btn1);
		add(btn2);
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
				int length = txtName.getText().length() * txtPass.getText().length() * txtUserName.getText().length();
				String msg = "请填写";
				if (length == 0) {
					if (txtName.getText().length() == 0) {
						msg += "用户名 ";
					}
					if (txtPass.getText().length() == 0) {
						msg += "密码 ";
					}
					if (txtUserName.getText().length() == 0) {
						msg += "姓名";
					}
					msg += "!";

					JOptionPane.showMessageDialog(null, msg, null, JOptionPane.WARNING_MESSAGE, finalImg);

				}

				if (length != 0) {
					JOptionPane.showMessageDialog(null, "添加成功", "消息", JOptionPane.CANCEL_OPTION, finalImg);
					v.add(Integer.toString(id));
					v.add(txtName.getText());
					v.add(txtUserName.getText());
					v.add(cbo.getSelectedItem());
					v.add("不在岗");
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

	public Vector getV() {
		return v;
	}

}
