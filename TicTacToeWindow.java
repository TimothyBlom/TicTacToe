import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BoxLayout;



public class TicTacToeWindow {

	private JFrame frame;
	private String startGame = "x";
	private String currentPlayerName = "test name";
	private int Square1 = 0, Square2 = 0, Square3 = 0, Square4 = 0, Square5 = 0, Square6 = 0, Square7 = 0, Square8 = 0, Square9 = 0;

	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeWindow window = new TicTacToeWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the application.
	public TicTacToeWindow() {
		initialize();
	}
	
	//Check who's turn is it
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("x")) {
			startGame = "o";
			currentPlayerName = StartGameWindow.namePlayer2;
		}
		else {
			startGame = "x";
			currentPlayerName = StartGameWindow.namePlayer1;
		}
	}
	
	//Win conditions
	private void gameWon() {
		if(Square1==1 && Square2==1 && Square3==1){
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer1 + " has won");
		} else if (Square4==1 && Square5==1 && Square6==1) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer1 + " has won");
		} else if (Square7==1 && Square8==1 && Square9==1) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer1 + " has won");
		} else if (Square1==1 && Square4==1 && Square7==1) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer1 + " has won");
		} else if (Square2==1 && Square5==1 && Square8==1) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer1 + " has won");
		} else if (Square3==1 && Square6==1 && Square9==1) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer1 + " has won");
		} else if (Square1==1 && Square5==1 && Square9==1) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer1 + " has won");
		} else if (Square3==1 && Square5==1 && Square7==1) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer1 + " has won");
		} else if (Square1==2 && Square2==2 && Square3==2) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer2 + " has won");
		} else if (Square4==2 && Square5==2 && Square6==2) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer2 + " has won");
		} else if (Square7==2 && Square8==2 && Square9==2) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer2 + " has won");
		} else if (Square1==2 && Square4==2 && Square7==2) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer2 + " has won");
		} else if (Square2==2 && Square5==2 && Square8==2) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer2 + " has won");
		} else if (Square3==2 && Square6==2 && Square9==2) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer2 + " has won");
		} else if (Square1==2 && Square5==2 && Square9==2) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer2 + " has won");
		} else if (Square3==2 && Square5==2 && Square7==2) {
			JOptionPane.showMessageDialog(frame, StartGameWindow.namePlayer2 + " has won");
		} else if (	Square1!=0 && Square2!=0 && Square3!=0 && Square4!=0 && 
					Square5!=0 && Square6!=0 && Square7!=0 && Square8!=0 && Square9!=0) {
			JOptionPane.showMessageDialog(frame, "Tied");
		}
	};

	//Initialise the contents of the frame.
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 3, 2, 2));
		
		//Play field square 1
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 255));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn1.setText(null);
		btn1.setFocusable(false);
		panel_1.add(btn1, BorderLayout.CENTER);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("x"))
				{
					btn1.setText("x");
					Square1=1;
				}
				else 
				{
					btn1.setText("o");
					Square1=2;
				}
				btn1.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Play field square 2
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn2.setText(null);
		panel_2.add(btn2, BorderLayout.CENTER);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("x"))
				{
					btn2.setText("x");
					Square2=1;
				}
				else 
				{
					btn2.setText("o");
					Square2=2;
				}
				btn2.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Play field square 3
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn3.setText(null);
		panel_3.add(btn3, BorderLayout.CENTER);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("x"))
				{
					btn3.setText("x");
					Square3=1;
				}
				else 
				{
					btn3.setText("o");
					Square3=2;
				}
				btn3.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Play field square 4
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn4.setText(null);
		panel_4.add(btn4, BorderLayout.CENTER);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("x"))
				{
					btn4.setText("x");
					Square4=1;
				}
				else 
				{
					btn4.setText("o");
					Square4=2;
				}
				btn4.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Play field square 5
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn5.setText(null);
		panel_5.add(btn5, BorderLayout.CENTER);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("x"))
				{
					btn5.setText("x");
					Square5=1;
				}
				else 
				{
					btn5.setText("o");
					Square5=2;
				}
				btn5.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Play field square 6
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn6.setText(null);
		panel_6.add(btn6, BorderLayout.CENTER);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn6.setText("x");
					Square6=1;
				}
				else 
				{
					btn6.setText("o");
					Square6=2;
				}
				btn6.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Play field square 7
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn7.setText(null);
		panel_7.add(btn7, BorderLayout.CENTER);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn7.setText("x");
					Square7=1;
				}
				else 
				{
					btn7.setText("o");
					Square7=2;
				}
				btn7.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Play field square 8
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn8.setText(null);
		panel_8.add(btn8, BorderLayout.CENTER);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn8.setText("x");
					Square8=1;
				}
				else 
				{
					btn8.setText("o");
					Square8=2;
				}
				btn8.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Play field square 9
		JPanel panel_9 = new JPanel();
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btn9.setText(null);
		panel_9.add(btn9, BorderLayout.CENTER);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					btn9.setText("x");
					Square9=1;
				}
				else 
				{
					btn9.setText("o");
					Square9=2;
				}
				btn9.setEnabled(false);
				choosePlayer();
				gameWon();
			}
		});
		
		//Field with player names
		JPanel panel_10 = new JPanel();
		panel.add(panel_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.Y_AXIS));
		
		JLabel Player1Name = new JLabel(StartGameWindow.namePlayer1);
		panel_10.add(Player1Name);
		
		JLabel lblNewLabel_1 = new JLabel("VS");
		panel_10.add(lblNewLabel_1);
		
		JLabel Player2Name = new JLabel(StartGameWindow.namePlayer2);
		panel_10.add(Player2Name);
		
		
		//Field with player name who's turn it is  
		JPanel panel_11 = new JPanel();
		panel.add(panel_11);
		panel_11.setLayout(new BoxLayout(panel_11, BoxLayout.X_AXIS));
		
		JLabel PlayerTurn = new JLabel("Turn:");
		panel_11.add(PlayerTurn);
		
		JLabel playerName = new JLabel();
		panel_11.add(playerName);
		playerName.setText(currentPlayerName); //This does not correctly display the player name
		
		
		//New game button
		JPanel panel_12 = new JPanel();
		panel.add(panel_12);
		
		List<JButton> buttons = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
//		List<Integer> squares = Arrays.asList(Square1, Square2, Square3, Square4, Square5, Square6, Square7, Square8, Square9);
		
		JButton NewGameBtn = new JButton("New Game");
		panel_12.add(NewGameBtn);
		NewGameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        for (JButton button : buttons) {
		            button.setText(null);
		            button.setEnabled(true);
		        };
		        //This squares list does not work correctly
//		        for (int i = 0; i < squares.size(); i++) {
//		            squares.set(i, 0);
//		        };
				Square1=0;
				Square2=0;
				Square3=0;
				Square4=0;
				Square5=0;
				Square6=0;
				Square7=0;
				Square8=0;
				Square9=0;
			}
		});
	}

}
