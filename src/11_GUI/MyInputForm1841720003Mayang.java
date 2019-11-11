package hellogui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1841720003Mayang extends JFrame{
    private static final int frame_width = 600;
    private static final int frame_height = 200;
    private JLabel maLabel;
    private JLabel mbLabel;
    private JLabel mcLabel;
    private JTextField maField;
    private JTextField mbField;
    private JButton mButton;
    private JPanel mPanel;
    
    public MyInputForm1841720003Mayang(){
        createTextFieldMayang();
        createButtonMayang();
        createPanelMayang();
        setSize(frame_width, frame_height);
    }
    
    /*untuk menampilkan Text field 
    sebagai inputan maupun output pada window*/
    private void createTextFieldMayang(){
        maLabel = new JLabel("Nilai A: ");
        mbLabel = new JLabel("Nilai B: ");
        mcLabel = new JLabel("Nilai C: ");
        
        final int field_width = 10;
        maField = new JTextField(field_width);
        maField.setText("0");
        mbField = new JTextField(field_width);
        mbField.setText("0");
    }
    
    /*untuk membuat tampilan button/tombol pada window, dan 
    ketikkan script berikut sebagai event handling ketika 
    button di klik*/
    private void createButtonMayang(){
        mButton = new JButton ("Perkalian");//untuk membuat tombol calculate
        class AddInterestListener implements ActionListener{
            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(maField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(mbField.getText());
                int c = a * b;
                mcLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        mButton.addActionListener(listener);
    }

    
    /*untuk membuat panel dengan menambahkan script berikut*/
    private void createPanelMayang(){
        mPanel = new JPanel();
        mPanel.add(maLabel);
        mPanel.add(maField);
        mPanel.add(mbLabel);
        mPanel.add(mbField);
        mPanel.add(mButton);
        mPanel.add(mcLabel);
        add(mPanel);
    }
}