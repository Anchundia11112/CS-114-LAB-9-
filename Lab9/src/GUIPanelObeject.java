import java.awt.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class GUIPanelObeject extends JPanel{

	private JLabel mylabel;
	private JTextField fieldText;
	
	//Constructor to set up the fields 
	
	public GUIPanelObeject(String labelText, int fieldLabel){
		
		mylabel = new JLabel(labelText);
		fieldText = new JTextField(fieldLabel);
		
		add(mylabel);
		add(fieldText);
		
		setPreferredSize (new Dimension(500,325));
		
		
	}

	
}
