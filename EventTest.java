import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;

class EventTest extends JFrame implements ActionListener{
      JButton whiteButton,blackButton;
      Container c;
      
      public EventTest(){
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             setTitle("Event test");
             setSize(400,300);
             c = getContentPane();
             
             whiteButton = new JButton("îí");
             blackButton = new JButton("çï");
             whiteButton.addActionListener(this);
             blackButton.addActionListener(this);
             
             c.setLayout(new FlowLayout());
             c.add(whiteButton);
             c.add(blackButton);
             }
             @Override
             public void actionPerformed(ActionEvent e){
                 Color col;
                 if(e.getSource()== whiteButton){
                    col = Color.white;
                    }else{
                    col = Color.black;
                    }
                    c.setBackground(col);
                    repaint();
                    }
             public static void main(String[] args){
                    EventTest et = new EventTest();
                    
                    et.setVisible(true);
                    }
                   }
