import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NewFrame1 extends JFrame {
    private list list;
    private footer footer;
    private Done done;
    static int i=0;



    NewFrame1() {
        this.setBounds(20, 20, 1200, 720);
        ImageIcon icon = new ImageIcon(NewFrame1.class.getResource("final.png"));
        this.setIconImage(icon.getImage());
         list = new list();
         footer = new footer();
         done = new Done();
         this.add(list,BorderLayout.CENTER);
         this.add(footer,BorderLayout.SOUTH);
         this.add(done,BorderLayout.WEST);


    }

    public static void main(String[] args) {
        NewFrame1 frame1 = new NewFrame1();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
class footer extends JPanel{
    JButton roundButton;

    footer() {

        Color color = new Color(6, 119, 248);
        this.setLayout(new BorderLayout());
        this.setSize(1200, 400);
        this.setBackground(color);

        roundButton = new JButton("+ADD");
        roundButton.setBounds(860, 690, 320, 30);
        roundButton.setFocusPainted(false);
        roundButton.setOpaque(true);
        roundButton.setBackground(color);
        roundButton.setForeground(Color.WHITE);
        roundButton.setFont(new Font("Roboto", Font.BOLD, 18));




        this.add(roundButton);


        roundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewFrame2 newFrame2 = new NewFrame2();
                newFrame2.setVisible(true);
                JLabel label = new JLabel();


            }
        });


    }
}

class list extends JPanel{
    Color color = new Color(3, 165, 253);
     static JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9;

    list(){
        this.setSize(1200,500);
        this.setLayout(new GridLayout(10,1,0,5));
        this.setBackground(color);
        label1 = new JLabel();
        label1.setSize(1100,50);
        label1.setFont(new Font("Times new",Font.BOLD,14));


        label2 = new JLabel();
        label2.setSize(1200,50);
        label3 = new JLabel();
        label3.setSize(1200,50);
        label4 = new JLabel();
        label4.setSize(1200,50);
        label5 = new JLabel();
        label5.setSize(1200,50);
        label6 = new JLabel();
        label6.setSize(1200,50);
        label7 = new JLabel();
        label7.setSize(1200,50);
        label8 = new JLabel();
        label8.setSize(1200,50);
        label9 = new JLabel();
        label9.setSize(1200,50);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        this.add(label8);
        this.add(label9);
       // this.add(buttondone1,BorderLayout.SOUTH);
    }
}

class Done extends JPanel{
    static JButton buttondone1,buttondone2,buttondone3,buttondone4,buttondone5,buttondone6,buttondone7,buttondone8,buttondone9;

    Done(){

        Color color = new Color(6, 155, 248);
        Color color2 = new Color(6, 119, 248);
        this.setLayout(new GridLayout(10,1,5,5));
        //this.setSize(50, 400);
        this.setBackground(color);
        buttondone1 = new JButton("Done");
        buttondone1.setSize(40,20);
        buttondone1.setBackground(color2);
        buttondone1.setFocusPainted(false);
        buttondone1.setForeground(Color.WHITE);
        buttondone1.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone1.setVisible(false);
        buttondone1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label1.setText("");
                buttondone1.setVisible(false);
            }
        });

        buttondone2 = new JButton("Done");
        buttondone2.setSize(40,20);
        buttondone2.setBackground(color2);
        buttondone2.setFocusPainted(false);
        buttondone2.setForeground(Color.WHITE);
        buttondone2.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone2.setVisible(false);
        buttondone2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label2.setText("");
                buttondone2.setVisible(false);
            }
        });

        buttondone3 = new JButton("Done");
        buttondone3.setSize(40,20);
        buttondone3.setBackground(color2);
        buttondone3.setFocusPainted(false);
        buttondone3.setForeground(Color.WHITE);
        buttondone3.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone3.setVisible(false);
        buttondone3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label3.setText("");
                buttondone3.setVisible(false);
            }
        });

        buttondone4 = new JButton("Done");
        buttondone4.setSize(40,20);
        buttondone4.setBackground(color2);
        buttondone4.setFocusPainted(false);
        buttondone4.setForeground(Color.WHITE);
        buttondone4.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone4.setVisible(false);
        buttondone4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label4.setText("");
                buttondone4.setVisible(false);
            }
        });

        buttondone5 = new JButton("Done");
        buttondone5.setSize(40,20);
        buttondone5.setBackground(color2);
        buttondone5.setFocusPainted(false);
        buttondone5.setForeground(Color.WHITE);
        buttondone5.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone5.setVisible(false);
        buttondone5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label5.setText("");
                buttondone5.setVisible(false);
            }
        });

        buttondone6 = new JButton("Done");
        buttondone6.setSize(40,20);
        buttondone6.setBackground(color2);
        buttondone6.setFocusPainted(false);
        buttondone6.setForeground(Color.WHITE);
        buttondone6.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone6.setVisible(false);
        buttondone6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label6.setText("");
                buttondone6.setVisible(false);
            }
        });

        buttondone7 = new JButton("Done");
        buttondone7.setSize(40,20);
        buttondone7.setBackground(color2);
        buttondone7.setFocusPainted(false);
        buttondone7.setForeground(Color.WHITE);
        buttondone7.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone7.setVisible(false);
        buttondone7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label7.setText("");
                buttondone7.setVisible(false);
            }
        });

        buttondone8 = new JButton("Done");
        buttondone8.setSize(40,20);
        buttondone8.setBackground(color2);
        buttondone8.setFocusPainted(false);
        buttondone8.setForeground(Color.WHITE);
        buttondone8.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone8.setVisible(false);
        buttondone8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label8.setText("");
                buttondone8.setVisible(false);
            }
        });

        buttondone9 = new JButton("Done");
        buttondone9.setSize(40,20);
        buttondone9.setBackground(color2);
        buttondone9.setFocusPainted(false);
        buttondone9.setForeground(Color.WHITE);
        buttondone9.setFont(new Font("Roboto", Font.BOLD, 18));
        buttondone9.setVisible(false);
        buttondone9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                list.label9.setText("");
                buttondone9.setVisible(false);
            }
        });


        this.add(buttondone1);
        this.add(buttondone2);
        this.add(buttondone3);
        this.add(buttondone4);
        this.add(buttondone5);
        this.add(buttondone6);
        this.add(buttondone7);
        this.add(buttondone8);
        this.add(buttondone9);
    }

}
