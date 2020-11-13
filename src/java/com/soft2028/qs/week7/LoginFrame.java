package com.soft2028.qs.week7;

import javax.swing.*;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/12
 **/
public class LoginFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel leftPanel;
    private JPanel logoPanel;
    private JPanel loginPanel;
    private JLabel loginLabel;
    private JLabel loginText;
    private JTextField userPanel;
    private JTextField psdPanel;
    private JButton loginBtn;
    private JLabel loginTitle;

    public LoginFrame() {
        init();
        loginBtn.addActionListener(e -> {
            String user = userPanel.getText();
            String pwd = psdPanel.getText();
            if ("msz".equals(user)&&"msz".equals(pwd)){
                JOptionPane.showMessageDialog(null,"登录成功");
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(null,"登录失败");

            }
        });
    }

    private void init() {
        setTitle("LoginFrame");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(2560, 1600);
        setLocationRelativeTo(null);
//        frame.pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        //通过屏幕尺寸设置窗体大小
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dimension = toolkit.getScreenSize();
//        System.out.println(dimension);
//        frame.setSize(dimension);

        //通过内置方法设置窗体大小
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setVisible(true);

    }
}
