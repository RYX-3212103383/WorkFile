import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Vector;

public class Add extends JFrame {
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

    public Add(Work1 work1) {
        super();
        Vector v = new Vector();
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //事件监听
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String txtNameText = txtName.getText();
                ImageIcon image = null;
                if (txtNameText == null || "".equals(txtNameText.trim())){
                    try {
                        image = new ImageIcon(ImageIO.read(getClass().getResource("/img.png")));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    //弹框提示
                    //
                    JOptionPane.showMessageDialog(null, "请填写用户名！","消息",JOptionPane.CANCEL_OPTION,image);
                    //程序不能往下走
                    return;
                }


                String txtPassText = txtPass.getText();
                if (txtPassText == null || "".equals(txtPassText.trim())){
                    try {
                        image = new ImageIcon(ImageIO.read(getClass().getResource("/img.png")));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    //弹框提示
                    //
                    JOptionPane.showMessageDialog(null, "请填写密码!","消息",JOptionPane.CANCEL_OPTION,image);
                    //程序不能往下走
                    return;
                }


                String text = txtUserName.getText();
                if(text == null || "".equals(text.trim())){
                    try {
                        image = new ImageIcon(ImageIO.read(getClass().getResource("/img.png")));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "请填写姓名!","消息",JOptionPane.CANCEL_OPTION,image);
                    return;
                }


                if (text != null && txtPassText != null && txtNameText != null) {
                    try {
                        image = new ImageIcon(ImageIO.read(getClass().getResource("/img.png")));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "添加成功", "消息", JOptionPane.CANCEL_OPTION, image);
                }

                String zx =(String) cbo.getSelectedItem();


                String sm = "不在岗";

                //进行添加

                int lastRow = work1.getDtm().getRowCount() - 1;
                int lastId = Integer.parseInt(work1.getDtm().getValueAt(lastRow, 0).toString());
                int newId = lastId + 1;
                v.add(newId);
                v.add(txtNameText);
                v.add(text);
                v.add(zx);
                v.add(sm);

                work1.getRows().addElement(v);
                work1.setDtm(new DefaultTableModel(work1.getRows(),work1.getCols()));
                work1.getTable().setModel(work1.getDtm());
                dispose();
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
