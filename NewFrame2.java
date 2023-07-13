import com.toedter.calendar.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static java.awt.Font.*;

public class NewFrame2 extends JFrame {
    private JPanel container;
    private JTextField textField;
    private JLabel label,label2,label3,label4,label5;
    private JDateChooser dateChooser = new JDateChooser();

    private JSpinner spinner,spinner2,model3;

    private JPanel panel;
    public JButton button,button2;
    private JButton buttondone;
    private JRadioButton radioButton;





    String arr[] = {"AM","PM"};

    NewFrame2(){
        initcomp();


    }

    public void initcomp(){
       // NewFrame1 newFrame1 =new NewFrame1();
        container = new JPanel();
        container.setSize(1200,720);
        container.setLayout(null);
        this.add(container);
        //container = this.getContentPane();
        Color colorbackground = new Color(51, 177, 246);
        container.setBackground(colorbackground);
        this.setBounds(20, 20, 1200, 720);
        ImageIcon icon = new ImageIcon(NewFrame1.class.getResource("final.png"));
        this.setIconImage(icon.getImage());
        textField = new JTextField();
        textField.setBounds(70,50,700,50);

        Color colortextfield = new Color(231, 225, 225, 255);
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font("Raleway",BOLD,13));
        textField.setBackground(colortextfield);
        textField.setToolTipText("Enter Task");


        label = new JLabel("What is to done?");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Raleway", BOLD,18));

        label.setBounds(70,20,200,20);

        label2 = new JLabel("Due Date");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Raleway", BOLD,14));
        label2.setBounds(70,110,100,10);


        dateChooser.setBounds(70,130,200,40);

        button = new JButton("Select Time");
        button.setFont(new Font("Raleway", BOLD,14));
        button.setBounds(70,180,200,30);
        button.setFocusPainted(false);
        button.setOpaque(true);
        button.setBackground(Color.CYAN);
        button.setForeground(Color.BLACK);
        button.setEnabled(false);
        button.setFont(new Font("Roboto", CENTER_BASELINE,16));


        button2 = new JButton("DONE");
        button2.setBounds(370,500,110,40);
        button2.setOpaque(true);
        button2.setBackground(Color.CYAN);
        button2.setFocusPainted(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String value_hour = spinner.getValue().toString();
                String value_ampm = model3.getValue().toString();
                String value_minute = spinner2.getValue().toString();
                String text = textField.getText();
                String date = dateChooser.getDate().toString();
                NewFrame1.i++;
                int i = NewFrame1.i;
                if(i==9){
                    NewFrame1.i = 0;
                }
               // list.label1.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);

                if (i==1){
                    list.label1.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone1.setVisible(true);
                }
                else if (i==2){
                    list.label2.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone2.setVisible(true);
                }
                else if (i==3){
                    list.label3.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone3.setVisible(true);
                }
                else if (i==4){
                    list.label4.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone4.setVisible(true);
                }
                else if (i==5){
                    list.label5.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone5.setVisible(true);
                }
                else if (i==6){
                    list.label6.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone6.setVisible(true);
                }else if (i==7){
                    list.label7.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone7.setVisible(true);
                }else if (i==8){
                    list.label8.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone8.setVisible(true);
                }else if (i==9){
                    list.label9.setText(text+" "+date+" "+value_hour+":"+value_minute+" "+value_ampm);
                    Done.buttondone9.setVisible(true);
                }

                dispose();

            }
        });

        label3 = new JLabel("Hour");
        label3.setForeground(Color.WHITE);
        label3.setBounds(70,220,120,20);

        label4 = new JLabel("Minute");
        label4.setForeground(Color.WHITE);
        label4.setBounds(230,220,120,20);

        SpinnerNumberModel value = new SpinnerNumberModel(12,1,12,1);
        SpinnerNumberModel value2 = new SpinnerNumberModel(00,0,59,1);

        spinner = new JSpinner(value);
        spinner.setBounds(70,250,60,30);
        spinner2 = new JSpinner(value2);
        spinner2.setBounds(214,250,60,30);

        SpinnerModel spinner3 = new SpinnerListModel(arr);
        model3 = new JSpinner(spinner3);
        model3.setBounds(150,250,40,30);


       // label5 = new JLabel("HI");
       // label5.setBounds(50,350,70,30);




        container.add(dateChooser);
        container.add(textField);
        container.add(label);
        container.add(label2);
        container.add(button);
        container.add(spinner);
        container.add(spinner2);
        container.add(label3);
        container.add(label4);
        container.add(model3);
        //container.add(label5);

        container.add(button2);


    }


    public static void main(String[] args) {
        NewFrame2 frame = new NewFrame2();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
