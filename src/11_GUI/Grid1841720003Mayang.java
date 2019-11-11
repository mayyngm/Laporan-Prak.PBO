package menejemenlayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Grid1841720003Mayang extends JFrame{
    private static final int frame_width = 600;
    private static final int frame_height = 200;
    private JPanel mPanel;
    
    //membuat konstruktor BorderLayoutForm
    public Grid1841720003Mayang(){
        mPanel = new JPanel();
        mPanel.setLayout(new GridLayout(4, 2));
        
        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        mPanel.add(new JButton("6"));
        mPanel.add(new JButton("7"));
        mPanel.add(new JButton("8"));
        
        add(mPanel);
        setSize(frame_width, frame_height);
        setTitle("Grid Layout Demo");
    }
}
