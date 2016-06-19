import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.BorderLayout;

class BorderLayoutTest extends JFrame{
  public static void main(String[] args){
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(300,300);
    
    Container c= f.getContentPane();
    c.setLayout(new BorderLayout());
    JButton b1 =new JButton("��");
    JButton b2 =new JButton("��");
    JButton b3 =new JButton("��");
    JButton b4 =new JButton("�k");
    JButton b5 =new JButton("����");
    c.add(b1,"East");
    c.add(b2,"West");
    c.add(b3,"South");
    c.add(b4,"North");
    c.add(b5,"Center");
    
    f.setVisible(true);
    }
    }