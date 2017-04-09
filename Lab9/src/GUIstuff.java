import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

@SuppressWarnings("serial")
public class GUIstuff extends JPanel{

	
	myHashFunction hashFunctionForGUI = new myHashFunction();
	String[] theArray;
	int arraySize;
	int itemsInArray = 0;
	
	private JLabel keyHint;
	private JLabel answerDisplay;
	private JButton clickButton;
	private static JTextField firstWordPanel;
	private static JTextField secondWordPanel;
	private static JTextField thirdWordPanel;
	private static JTextField fourthWordPanel;
	private static JTextField keyWordPanel;
	
	
	static String wordOne;

	static String wordTwo;

	static String wordThree;

	static String wordFour;
	
	static String keyWord;
	
	
	public JButton searchButton;

	public GUIstuff(){
		
		//Fields in the GUI 
		
		firstWordPanel = new JTextField(30);
		secondWordPanel = new JTextField(30);
		thirdWordPanel = new JTextField(30);
		fourthWordPanel = new JTextField(30);
		keyWordPanel = new JTextField(30);
		answerDisplay = new JLabel("Enter four words + Your key to search");
		keyHint = new JLabel("Your key is the index of the word you are looking for.");

		
		//The regular button
		
		clickButton = new JButton("Press Here Please");
		clickButton.addActionListener(new buttonObjective());
		
		//The search Function
			
		searchButton = new JButton("Click to search");
		
		//Creating the search functionality
		
		searchButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			    wordOne = firstWordPanel.getText();
				wordTwo = secondWordPanel.getText();
				wordThree = thirdWordPanel.getText();
				wordFour = fourthWordPanel.getText();
				keyWord = keyWordPanel.getText();
				
				String[] theArrayWePlanToAdd = {wordOne, wordTwo, wordThree, wordFour};	
				hashFunctionForGUI.arrayFill(theArrayWePlanToAdd, hashFunctionForGUI.theArray);
				boolean foundOrNot = hashFunctionForGUI.findTheKey(keyWord);
				
				if(foundOrNot){
					
					keyHint.setText("Found");
					
					
				}
				
				else
					
					keyHint.setText("Not Found");
				
				
			}
		
		}
		
		);
		
		
		//Putting everything into the Screen
		add(firstWordPanel);
		add(secondWordPanel);
		add(thirdWordPanel);
		add(fourthWordPanel);
		add(keyWordPanel);
		add(clickButton);
		add(searchButton);
		add(answerDisplay);
		add(keyHint);
		
		setPreferredSize (new Dimension(500,325));
		
		setBackground(Color.cyan);
					
	}
	
	//Adding functionality to the button 
	
	private class buttonObjective implements ActionListener{
		
		public void actionPerformed (ActionEvent theEvent){
			
			System.out.println("First Word: " + firstWordPanel.getText());
			System.out.println("Second Word: " + secondWordPanel.getText());
			System.out.println("Third Word: " + thirdWordPanel.getText());
			System.out.println("Fourth Word: " + fourthWordPanel.getText());
			String word = firstWordPanel.getText();
			answerDisplay.setText(word);

		}
	}
	
	public static void main(String[] args) {
			
		JFrame myFrame = new JFrame ("The Title");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    myFrame.getContentPane().add(new GUIstuff());
	    myFrame.pack();
	    myFrame.setVisible(true);
		
	}
	
}
