package StdResults;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class StdResult {

	private JFrame frame;
	private JTextField textStd_ID;
	private JTextField textFName;
	private JTextField textSurname;
	private JTextField textComputing;
	private JTextField textBiology;
	private JTextField textEnglish;
	private JTextField textMaths;
	private JTextField textChemistry;
	private JTextField textPhysics;
	private JTextField textTScore;
	private JTextField textAverage;
	private JTextField textRanking;
	private JTextField textAddMaths;
	private JTextField textBusiness;
	private JTable table;
	private JLabel lblAddMaths;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StdResult window = new StdResult();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StdResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1380, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "Student Result Recording System", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 724, 523);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudent_ID = new JLabel("Student_ID");
		lblStudent_ID.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblStudent_ID.setBounds(10, 21, 146, 37);
		panel.add(lblStudent_ID);
		
		textStd_ID = new JTextField();
		textStd_ID.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textStd_ID.setBounds(154, 21, 205, 34);
		panel.add(textStd_ID);
		textStd_ID.setColumns(10);
		
		textFName = new JTextField();
		textFName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFName.setColumns(10);
		textFName.setBounds(154, 83, 205, 34);
		panel.add(textFName);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblFirstName.setBounds(10, 81, 146, 37);
		panel.add(lblFirstName);
		
		textSurname = new JTextField();
		textSurname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textSurname.setColumns(10);
		textSurname.setBounds(154, 148, 205, 34);
		panel.add(textSurname);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSurname.setBounds(10, 148, 146, 37);
		panel.add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblCourseCode.setBounds(10, 217, 154, 37);
		panel.add(lblCourseCode);
		
		textComputing = new JTextField();
		textComputing.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
						evt.consume();
			    }
			}
		});
		textComputing.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textComputing.setColumns(10);
		textComputing.setBounds(500, 220, 205, 34);
		panel.add(textComputing);
		
		JLabel lblComputing = new JLabel("Computing");
		lblComputing.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblComputing.setBounds(369, 217, 134, 37);
		panel.add(lblComputing);
		
		textBiology = new JTextField();
		textBiology.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
						evt.consume();
			    }
			}
		});
		textBiology.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textBiology.setColumns(10);
		textBiology.setBounds(500, 151, 205, 34);
		panel.add(textBiology);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBiology.setBounds(369, 147, 134, 37);
		panel.add(lblBiology);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEnglish.setBounds(369, 82, 134, 37);
		panel.add(lblEnglish);
		
		textEnglish = new JTextField();
		textEnglish.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
						evt.consume();
			    }
			}
		});
		textEnglish.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textEnglish.setColumns(10);
		textEnglish.setBounds(500, 83, 205, 34);
		panel.add(textEnglish);
		
		textMaths = new JTextField();
		textMaths.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
						evt.consume();
			}
			}
		});
		textMaths.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textMaths.setColumns(10);
		textMaths.setBounds(500, 21, 205, 34);
		panel.add(textMaths);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblMaths.setBounds(369, 21, 134, 37);
		panel.add(lblMaths);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblChemistry.setBounds(369, 265, 134, 37);
		panel.add(lblChemistry);
		
		textChemistry = new JTextField();
		textChemistry.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
						evt.consume();
			    }
			}
		});
		textChemistry.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textChemistry.setColumns(10);
		textChemistry.setBounds(500, 269, 205, 34);
		panel.add(textChemistry);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPhysics.setBounds(369, 334, 134, 37);
		panel.add(lblPhysics);
		
		textPhysics = new JTextField();
		textPhysics.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
						evt.consume();
			    }
			}
		});
		textPhysics.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textPhysics.setColumns(10);
		textPhysics.setBounds(500, 338, 205, 34);
		panel.add(textPhysics);
		
		JLabel lblTScore = new JLabel("Total Score");
		lblTScore.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTScore.setBounds(10, 335, 146, 37);
		panel.add(lblTScore);
		
		textTScore = new JTextField();
		textTScore.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textTScore.setColumns(10);
		textTScore.setBounds(154, 335, 205, 34);
		panel.add(textTScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAverage.setBounds(10, 396, 134, 37);
		panel.add(lblAverage);
		
		textAverage = new JTextField();
		textAverage.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textAverage.setColumns(10);
		textAverage.setBounds(154, 396, 205, 34);
		panel.add(textAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRanking.setBounds(10, 465, 134, 37);
		panel.add(lblRanking);
		
		textRanking = new JTextField();
		textRanking.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textRanking.setColumns(10);
		textRanking.setBounds(154, 465, 205, 34);
		panel.add(textRanking);
		
		lblAddMaths = new JLabel("Add Maths");
		lblAddMaths.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAddMaths.setBounds(369, 396, 134, 37);
		panel.add(lblAddMaths);
		
		textAddMaths = new JTextField();
		textAddMaths.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
						evt.consume();
			    }
			}
		});
		textAddMaths.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textAddMaths.setColumns(10);
		textAddMaths.setBounds(500, 399, 205, 34);
		panel.add(textAddMaths);
		
		JLabel lblBusiness = new JLabel("Business");
		lblBusiness.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBusiness.setBounds(369, 465, 134, 37);
		panel.add(lblBusiness);
		
		textBusiness = new JTextField();
		textBusiness.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber))
						||(iNumber == KeyEvent.VK_BACK_SPACE)
						||(iNumber == KeyEvent.VK_DELETE)){
						evt.consume();
			    }
			}
		});
		textBusiness.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textBusiness.setColumns(10);
		textBusiness.setBounds(500, 468, 205, 34);
		panel.add(textBusiness);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CC75787", "CC78567", "CC57478", "CC78541", "CC45642", "CC35436"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox.setBounds(174, 217, 185, 37);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 286, 349, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "Student Transcript", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_1.setBounds(734, 11, 539, 523);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtTranscript = new JTextArea();
		txtTranscript.setBounds(10, 21, 519, 491);
		panel_1.add(txtTranscript);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setFont(new Font("Tahoma", Font.PLAIN,14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student_ID", "Course_Code", "Maths", "English", "Biology", "Computing", "Chemistry", "Computing", "Physics", "Add Maths", "Business", "Total Score", "Average", "Ranking"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(88);
		table.getColumnModel().getColumn(1).setPreferredWidth(60);
		table.setBounds(10, 555, 1263, 54);
		frame.getContentPane().add(table);
		
		JButton btnAddResult = new JButton("Add Result");
		btnAddResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] R = new double[13];
				R[0] = Double.parseDouble(textMaths.getText());
				R[1] = Double.parseDouble(textEnglish.getText());
				R[2] = Double.parseDouble(textBiology.getText());
				R[3] = Double.parseDouble(textComputing.getText());
				R[4] = Double.parseDouble(textChemistry.getText());
				R[5] = Double.parseDouble(textPhysics.getText());
				R[6] = Double.parseDouble(textAddMaths.getText());
				R[7] = Double.parseDouble(textBusiness.getText());
				
				R[8] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7])/8;
				R[9] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7]);
				
				String Average = String.format("%.0f", R[8]);
				textAverage.setText(Average);
				
				String iTotal = String.format("%.0f", R[9]);
				textTScore.setText(iTotal);
				
				if(R[9] >=700) {
					textRanking.setText("1st");
				}else if(R[9] >=600) {
					textRanking.setText("2i");
				}else if(R[9] >=500) {
					textRanking.setText("2ii");
				}else if(R[9] >=400) {
					textRanking.setText("3rd");
				}else if(R[9] >=300) {
					textRanking.setText("Certificate of HE");
				}else if(R[9] >=200) {
					textRanking.setText("Fail");
				}
				
				//========================================================
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						textStd_ID.getText(),
						comboBox.getSelectedItem(),
						textMaths.getText(),
						textEnglish.getText(),
						textBiology.getText(),
						textComputing.getText(),
						textChemistry.getText(),
						textPhysics.getText(),
						textAddMaths.getText(),
						textBusiness.getText(),
						textTScore.getText(),
						textAverage.getText(),
						textRanking.getText(),
						
						
				});
				//========================================================
			}
		});
		btnAddResult.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAddResult.setBounds(118, 647, 182, 42);
		frame.getContentPane().add(btnAddResult);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===========================================================
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getSelectedRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No data to delete", "Student Result System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select a row to delete ", "Student Result System", JOptionPane.OK_OPTION);
					}
					}else {
						model.removeRow(table.getSelectedRow());
					}
				//===========================================================
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDelete.setBounds(322, 647, 182, 42);
		frame.getContentPane().add(btnDelete);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=====================================================
				txtTranscript.append("Student Result Recording Systems\n"
						+"====================================\n"
						+"Maths:\t\t" +textMaths.getText()
						+"\nEnglish:\t\t" +textEnglish.getText()
						+"\nBiology:\t\t" +textBiology.getText()
						+"\nComputing:\t\t" +textComputing.getText()
						+"\nChemistry:\t\t" +textChemistry.getText()
						+"\nPhysics:\t\t" +textPhysics.getText()
						+"\nAdd Maths:\t\t" +textAddMaths.getText()
						+"\nBusiness:\t\t" +textBusiness.getText()
						+"\n====================================="
						+"\nTotal Score:\t\t" +textTScore.getText()
						+"\nAverage:\t\t" +textAverage.getText()
						+"\nRanking:\t\t" +textRanking.getText()+"\n"
						);
				//======================================================
				
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnTranscript.setBounds(540, 647, 182, 42);
		frame.getContentPane().add(btnTranscript);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp=null;
				for(java.awt.Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
					}
				}
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnReset.setBounds(758, 647, 182, 42);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Result System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnExit.setBounds(973, 647, 182, 42);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(67, 634, 1154, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 531, 103, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCourseCode_1 = new JLabel("Course Code");
		lblCourseCode_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourseCode_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseCode_1.setBounds(112, 531, 78, 25);
		frame.getContentPane().add(lblCourseCode_1);
		
		JLabel lblMaths_1 = new JLabel("Maths");
		lblMaths_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaths_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMaths_1.setBounds(190, 531, 92, 25);
		frame.getContentPane().add(lblMaths_1);
		
		JLabel lblCourseCode_1_1 = new JLabel("English");
		lblCourseCode_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseCode_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourseCode_1_1.setBounds(278, 531, 92, 25);
		frame.getContentPane().add(lblCourseCode_1_1);
		
		JLabel lblBiology_1 = new JLabel("Biology");
		lblBiology_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiology_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBiology_1.setBounds(371, 531, 86, 25);
		frame.getContentPane().add(lblBiology_1);
		
		JLabel lblCourseCode_1_2 = new JLabel("Computing");
		lblCourseCode_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseCode_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourseCode_1_2.setBounds(459, 531, 92, 25);
		frame.getContentPane().add(lblCourseCode_1_2);
		
		JLabel lblChemistry_1 = new JLabel("Chemistry");
		lblChemistry_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblChemistry_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChemistry_1.setBounds(546, 531, 92, 25);
		frame.getContentPane().add(lblChemistry_1);
		
		JLabel lblCourseCode_1_3 = new JLabel("Physics");
		lblCourseCode_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseCode_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourseCode_1_3.setBounds(636, 531, 92, 25);
		frame.getContentPane().add(lblCourseCode_1_3);
		
		JLabel lblAddMaths_1 = new JLabel("Add Maths");
		lblAddMaths_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddMaths_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddMaths_1.setBounds(724, 531, 102, 25);
		frame.getContentPane().add(lblAddMaths_1);
		
		JLabel lblCourseCode_1_4 = new JLabel("Business");
		lblCourseCode_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseCode_1_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourseCode_1_4.setBounds(822, 531, 85, 25);
		frame.getContentPane().add(lblCourseCode_1_4);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(906, 531, 92, 25);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblCourseCode_1_5 = new JLabel("Average");
		lblCourseCode_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseCode_1_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourseCode_1_5.setBounds(994, 531, 92, 25);
		frame.getContentPane().add(lblCourseCode_1_5);
		
		JLabel lblRanking_1 = new JLabel("Ranking");
		lblRanking_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRanking_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRanking_1.setBounds(1093, 531, 103, 25);
		frame.getContentPane().add(lblRanking_1);
		
		JLabel lblCourseCode_1_6 = new JLabel("Course Code");
		lblCourseCode_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseCode_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCourseCode_1_6.setBounds(1195, 531, 78, 25);
		frame.getContentPane().add(lblCourseCode_1_6);
	}
}
