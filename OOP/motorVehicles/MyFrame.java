package OOP.motorVehicles;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    final static String fileName = "data.txt";

    MotorVehicle[] array;

    ReadThread readThread;

    JButton buttonRead;
    JButton buttonSave;
    JTextArea textArea;

    public MyFrame(MotorVehicle[] vhl){
        this.array = vhl;

        buttonRead = new JButton("Nuskaityti");
        buttonSave = new JButton("Issaugoti");
        textArea = new JTextArea();

        buttonRead.setBounds(80, 50, 100, 50);
        buttonSave.setBounds(250, 50, 100, 50);
        buttonRead.addActionListener(this);
        buttonSave.addActionListener(this);
        textArea.setBounds(50, 230, 400, 200);
        textArea.setEditable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 200);
        this.setVisible(true);
        this.add(buttonRead);
        this.add(buttonSave);
//        this.add(textArea);
    }

    public void SetLabelText(String s){
        textArea.setText(s);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonRead){
            readThread = new ReadThread(fileName, array);
            Thread thread = new Thread(readThread);
            thread.start();
        }

        if(e.getSource() == buttonSave){
            SaveThread saveThread = new SaveThread(fileName, array);
            Thread thread = new Thread(saveThread);
            thread.start();
        }
    }
}
