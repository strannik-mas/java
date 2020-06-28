package demoswing1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InvokeLater extends JFrame {

    private JButton button;
    private JLabel  label;

    public InvokeLater() {
        super("InvokeLater");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton("��������� ������� ������");
        label  = new JLabel("��� ���������� ������ : Thread-"+
                Thread.currentThread().getName());
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            // �������� ��������� �����
            new ComplexJobThread().start();
            label.setText("���������...: Thread-"+
                Thread.currentThread().getName()); }
            });

        getContentPane(). setLayout(new FlowLayout());
        getContentPane().add(label);
        getContentPane().add(button);
        setSize(400, 100);
        setVisible(true);
    }
    // �����,����������� "������� ������"
    class ComplexJobThread extends Thread {
        public void run() {
            try {
                for(int i=0; i<5; i++) {
                    sleep(500);
                    System.out.println(Thread.currentThread().getName());
                }

                // ������ ���������
                EventQueue.invokeLater(new Runnable() {
                public void run() {
                    label.setText("������ ��������� : Thread-"+
                        Thread.currentThread().getName());
                }});
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new InvokeLater();	//�����, �.�. ���������� �� �� ������ ����������������� ����������, � �� ��������
    }
}
