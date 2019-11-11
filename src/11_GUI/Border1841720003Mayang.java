package menejemenlayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Border1841720003Mayang extends JFrame{
    private static final int frame_width = 600;
    private static final int frame_height = 200;
    private JPanel mPanel;
    
    //membuat konstruktor BorderLayoutForm
    public Border1841720003Mayang(){
        mPanel = new JPanel();
        mPanel.setLayout(new BorderLayout());
        
        mPanel.add(new JButton("1"), BorderLayout.NORTH);
        mPanel.add(new JButton("2"), BorderLayout.WEST);
        mPanel.add(new JButton("3"), BorderLayout.CENTER);
        mPanel.add(new JButton("4"), BorderLayout.EAST);
        mPanel.add(new JButton("5"), BorderLayout.SOUTH);
        
        add(mPanel);
        setSize(frame_width, frame_height);
        setTitle("Border Layout Demo");
    }
}