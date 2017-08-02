package chapter12;

//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 * Kenneth Drake-Sargent
 * Chapter 12 
 * Programming Challenge 3, 
 * Dorm and Meal Plan Calculator
 */

public class DormAndMealPlanCalc extends JFrame {
	final int WINDOW_WIDTH = 500;
	final int WINDOW_HEIGHT = 500;
	// Array with dorm names
	String[] dorms = {"Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"};
	// Array with meal plan descriptions
	String[] mPlans = {"7 meals per week", "14 meals per week", "Unlimited meals"};
    // Combo box to display dorms
	JComboBox dormCombo; 
	// Combo box to display meal plans
	JComboBox mPlanCombo; 
	// To calculate prices
	JButton calcPrices;
	// To exit the application
	JButton exit;
    // Panel for dorm combo box
	JPanel dormPanel;
	// Panel for meal combo box
	JPanel mPlanPanel;
	// Panel for the buttons
	JPanel buttonPanel;

	/**
	 * Constructor
	 */

	public DormAndMealPlanCalc() {
		// Display a title.
		super("Dorm and Meal Plan Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLayout(new GridLayout(3,1));
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Build the dorm panel.
		buildDormPanel();
		// Build the meal plan panel.
		buildMealPanel();
		// Build the button panel.
		buildButtonPanel();
		// Add the panels to the content pane.
		add(dormPanel);
		add(mPlanPanel);
		add(buttonPanel);
		// Pack and display the window.
		pack();
		setVisible(true);
	}

	/**
	 * buildDormPanel method
	 */

	private void buildDormPanel() {
		// Create a label prompting the user to select a dorm.
		JLabel dLabel = new JLabel("Select a Dorm.");
		// Create the dorm combo box.
		dormCombo = new JComboBox(dorms);
		// Put the components in a panel.
		dormPanel = new JPanel();
		dormPanel.add(dLabel);
		dormPanel.add(dormCombo);
	
	}

	/**
	 * buildMealPanel method
	 */

	private void buildMealPanel() {
		// Create a label prompting the user to select a meal plan.
		JLabel mLabel = new JLabel("Select a Meal Plan.");
		// Create the meal plan combo box.
		mPlanCombo = new JComboBox(mPlans);
		// Put the components in a panel.
		mPlanPanel = new JPanel();
		mPlanPanel.add(mLabel);
		mPlanPanel.add(mPlanCombo);
	}

	/**
	 * buildButtonPanel method
	 */

	private void buildButtonPanel() {
		// Create a button to calculate the charges.
		calcPrices = new JButton("Calculate Prices");
		// Add an action listener to the button.
		calcPrices.addActionListener(new CalcButtonListener());
		// Create a button to exit the application.
		exit = new JButton("Exit");
		// Add an action listener to the button.
		exit.addActionListener(new ExitButtonListener());
		// Put the buttons in their own panel.
		buttonPanel = new JPanel();
		buttonPanel.add(calcPrices);
		buttonPanel.add(exit);
		
	}

	
	/**
	 * CalcButtonListener is an action listener class for the calcbutton
	 * component.
	 */
	
	//calc code here
	private class CalcButtonListener implements ActionListener{
		
		//data structure to hold 2d array of costs per hall
		double [][] prices = {{2060.00, 2595.00, 3000.00},{2160.00,2695.00,3100.00},{1760.00,2295.00,2700.00},{2360.00,2895.00,3300.00}};
		//formatter to make the doubles pretty
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		
		//action definition
		public void actionPerformed(ActionEvent e){
			String actionCommand = e.getActionCommand();
			if (actionCommand.equals("Calculate Prices")){
				//variable to get and store dorm from JComboBox
				String dorm = (String) dormCombo.getSelectedItem();
				//variable to get and store meal plan from JComboBox
				String mPlan = (String) mPlanCombo.getSelectedItem();
				
				//find out which dorm is selected
				for (int i = 0; i < dorms.length; i++){
					if (dorms[i].equals(dorm)){
						//find out which meal plan is selected
						for (int j = 0; j < mPlans.length; j++){
							if (mPlans[j].equals(mPlan)){
								//show in a message dialog box the meal plan price for the dorm and meal plan
								JOptionPane.showMessageDialog(null, "Total Charges per Semester: $"+formatter.format(prices[i][j]),"Message",JOptionPane.INFORMATION_MESSAGE);
							}
						}
					}
				}
				
			}
		}
	}
            
	
	/**
	 * ExitButtonListener is an action listener class for the exitButton
	 * component.
	 */

    //exit code here
	private class ExitButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
				System.exit(0);
		}
	}

	
	/**
	 * The main method creates an instance of the DormAndMealPlanCalc class.
	 */
	public static void main(String[] args) {
		DormAndMealPlanCalc dmpc = new DormAndMealPlanCalc();
	}
}
