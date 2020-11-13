package com.soft2028.qs.Frame;

import com.soft2028.qs.week6.*;

import javax.swing.*;

/**
 * @ClassName StudentFrame
 * @Description TODO
 * @Author Chris
 * @Date 2020/11/13
 **/
public class StudentFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel leftPanel;
    private JTextField nameField;
    private JButton 检查Button;
    private JTextField weightField;
    private JLabel resultLabel;

    public StudentFrame() {
        检查Button.addActionListener(e -> {
            //点击按钮需要做的逻辑
            System.out.println("click");
            String name = nameField.getText();
            String weight = weightField.getText();
            Student student = Student.builder().name(name).weight(Integer.parseInt(weight)).build();
            StudentService ss = new StudentServiceImpl();
            boolean b = false;
            try {
                b = ss.checkHealth(student);
            } catch (TooHeavyException | NameException  ee) {
                JOptionPane.showMessageDialog(null,"体检未通过!");
                resultLabel.setText(student.getName()+"体检未通过");
            }finally {
                nameField.setText("");
                weightField.setText("");
            }
            if(b){
                JOptionPane.showMessageDialog(null,"通过!");
                resultLabel.setText(student.getName()+"体检通过");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentFrame");
        frame.setContentPane(new StudentFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        //frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
