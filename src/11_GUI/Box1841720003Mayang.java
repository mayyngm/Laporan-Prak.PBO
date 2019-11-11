package menejemenlayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Box1841720003Mayang extends JFrame{
    private static final int frame_width = 600;
    private static final int frame_height = 200;
    private JPanel mPanel;
    
    //membuat konstruktor BorderLayoutForm
    public Box1841720003Mayang(){
        mPanel = new JPanel();
        mPanel.setLayout(new BoxLayout(mPanel, BoxLayout.Y_AXIS));
        
        mPanel.add(new JButton("1"));
        mPanel.add(new JButton("2"));
        mPanel.add(new JButton("3"));
        mPanel.add(new JButton("4"));
        mPanel.add(new JButton("5"));
        
        add(mPanel);
        setSize(frame_width, frame_height);
        setTitle("Box Layout Demo");
    }
}
