package com.aaa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    public static void main(String[] args) {

        JFrame frame = new JFrame("MD5码转化工具");    //创建Frame窗口

        JPanel panel = new JPanel();    //创建一个JPanel对象

        JTextArea textArea = new JTextArea("请输入内容...",7,30);
        textArea.setSize(400, 100);
        textArea.setLineWrap(true);    //设置文本域中的文本为自动换行
        textArea.setForeground(Color.BLACK);    //设置组件的背景色
        textArea.setFont(new Font("楷体",Font.BOLD,16));    //修改字体样式
        textArea.setBackground(Color.WHITE);    //设置按钮背景色

        // JScrollPane jsp = new JScrollPane(textArea);    //将文本域放入滚动窗口
        // Dimension size = textArea.getPreferredSize();    //获得文本域的首选大小

        // jsp.setBounds(110,90,size.width,size.height);
        // jsp.setBounds(110,90,800, 300);

        // 关于按钮的代码都在这里
        JButton button = new JButton("转成MD5码");
        button.setSize(150, 150);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // System.out.println("按钮被按了一次"); 用于调试的
                String message = textArea.getText();
                MD5Utils md = new MD5Utils();
                String result = md.start(message).toUpperCase();
                JOptionPane.showMessageDialog(panel,"该文本的MD5码为：" + result,"提示",JOptionPane.PLAIN_MESSAGE);
            }
        });

        panel.add(textArea);
        panel.add(button);

        frame.add(panel);    //将JPanel容器添加到JFrame容器中

        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(500,300);    //设置窗口显示尺寸
        frame.setLocation(600, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        frame.setVisible(true);

    }
}
