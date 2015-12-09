package Visual;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logic.Jugador;


import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {
	//Variables
	
	private JPanel contentPane;
	private JTextField textFieldnombre;
	private JTextField textFieldapellidos;
	private JTextField textFieldedad;
	private JTextField textFieldMensaje;
	private Ventana1 referencia;
	private Ventana2 referencia2;
	
	
	//ObjetoJugador
	private Jugador NuevoJugador;
	
	//Constructor
	public Ventana1(Ventana2 v2) {
		setTitle ("Ventana de Inicio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		referencia=this;
		referencia2=v2;
		
		
		
		//Labels
		JLabel Label1 = new JLabel("DATOS DEL JUGADOR");
		Label1.setFont(new Font("Tahoma", Font.BOLD, 13));
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setBounds(36, 44, 135, 16);
		contentPane.add(Label1);
		
		JLabel Label2 = new JLabel("Nombre");
		Label2.setBounds(36, 104, 72, 16);
		contentPane.add(Label2);
		
		JLabel Label3 = new JLabel("Apellidos");
		Label3.setBounds(36, 154, 72, 16);
		contentPane.add(Label3);
		
		JLabel Label4 = new JLabel("Edad");
		Label4.setBounds(36, 205, 72, 16);
		contentPane.add(Label4);
		
		//JTextfields
		textFieldnombre = new JTextField();
		textFieldnombre.setBounds(123, 101, 116, 22);
		contentPane.add(textFieldnombre);
		textFieldnombre.setColumns(10);
		
		textFieldapellidos = new JTextField();
		textFieldapellidos.setColumns(10);
		textFieldapellidos.setBounds(123, 151, 116, 22);
		contentPane.add(textFieldapellidos);
		
		textFieldedad = new JTextField();
		textFieldedad.setColumns(10);
		textFieldedad.setBounds(123, 202, 116, 22);
		contentPane.add(textFieldedad);
		
		textFieldMensaje = new JTextField();
		textFieldMensaje.setColumns(10);
		textFieldMensaje.setBounds(65, 363, 443, 22);
		contentPane.add(textFieldMensaje);
		
		//CreoClaseJugador
		NuevoJugador=new Jugador();
		
		//Miboton
		JButton MiBoton = new JButton("A JUGAR!!");
		MiBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Si esto funciona
			if(textFieldnombre.getText().length()==0){
			textFieldMensaje.setText("Introduce todos los datos");}
			//haz esto
			else if (textFieldapellidos.getText().length()==0){
			textFieldMensaje.setText("Introduce todos los datos");}
			else if (textFieldedad.getText().length()==0){
				textFieldMensaje.setText("Introduce todos los datos");}
				
			//sino
			else{
		
						
						NuevoJugador.setNombre(textFieldnombre.getText());
						
						
						if(textFieldapellidos.getText().length()!=0) {
						NuevoJugador.setApellido(textFieldapellidos.getText());
						}
						
						if(textFieldedad.getText().length()!=0);
						{NuevoJugador.setEdad(Integer.valueOf(textFieldedad.getText()));}
						textFieldMensaje.setText("El Jugador "+NuevoJugador.getNombre()+" "+NuevoJugador.getApellido()+" de edad " +NuevoJugador.getEdad()+ " ha sido creado con exito");
						//Cerramos ventana1
						referencia.dispose();
						//Abrimos Ventana 2
						referencia2.setVisible(true);
						//Si la montaña no va a Mahoma, Mahoma va a la Montaña. 
						referencia2.LabelVentana2.setText("Bienvenido al Juego "+NuevoJugador.getNombre()+" "+NuevoJugador.getApellido());
					
						

						
		}
			}});
		MiBoton.setBounds(228, 313, 97, 25);
		contentPane.add(MiBoton);
	}
}
