import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;


public class Frame extends JFrame {
    private Container container;
    private JLabel background,title;
    private JButton button,eclipseButton;
    JButton customButton;
    ImageIcon icon;

    Frame(){
        initcomp();
    }
    public void initcomp(){

        container = this.getContentPane();
        Color color = new Color(3, 224, 253);
        container.setBackground(color);
        icon = new ImageIcon(getClass().getResource("final.png"));
        background = new JLabel("",icon,JLabel.CENTER);
        background.setBounds(0,0,1200,720);
        title = new JLabel("To Make Life Easier");

        title.setFont(new Font("Raleway",Font.BOLD,36));
        Color colortitle = new Color(5, 72, 110);
        title.setForeground(colortitle);
        title.setBounds(450,20,500,200);
        button = new JButton("ENTER");
        button.setBounds(520,550,150,50);
        button.setForeground(Color.BLUE);
        button.setBackground(color);
        button.setFocusPainted(false);
        //button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button.setOpaque(true);
        button.setFont(new Font("Arial",Font.ITALIC,14));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                NewFrame1 newFrame1 = new NewFrame1();
                newFrame1.setVisible(true);
                newFrame1.setDefaultCloseOperation(EXIT_ON_CLOSE);

            }
        });



        container.add(title);
        container.add(button);

        container.add(background);


    }



    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setTitle("TO-DO List");
        ImageIcon frameicon = new ImageIcon(Frame.class.getResource("final.png"));
        frame.setIconImage(frameicon.getImage());
        frame.setSize(1200,720);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
