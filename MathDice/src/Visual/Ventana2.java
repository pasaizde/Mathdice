package Visual;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Ventana2 extends JFrame {
	private JPanel contentPane;
	public JLabel LabelVentana2;
	//properties//
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//Label//
		LabelVentana2 = new JLabel("");
		LabelVentana2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelVentana2.setBounds(222, 13, 198, 16);
		contentPane.add(LabelVentana2);
		//LabelVentana2.setText("Bienvenido al juego");//
	}

}
