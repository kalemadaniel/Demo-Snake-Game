import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		//Creating the window with all its awesome snaky features
		Window frm= new Window();
		
		//Setting up the window settings
		frm.setTitle("Jeu serpent");
		frm.setSize(500,500);
                frm.setAlwaysOnTop(true);
                frm.setLocationRelativeTo(null);
		frm.setVisible(true);
                frm.setBackground(new java.awt.Color(250, 250, 250));
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             

	}
}