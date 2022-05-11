package entidades;

import java.time.LocalDate;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class NuevaPersona extends JFrame{
	
	private long id;
	private String nombre;
	private String telefono;
	private LocalDate fechaNac;
	private Documentacion nifnie;
	private JTextField textField;
	private final ButtonGroup buttonGroupTipo = new ButtonGroup();


	
	
	
	public NuevaPersona() {
		setTitle("Datos Personales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// parte nombre
		JLabel lblNombre = new JLabel("Nombre *:");
		lblNombre.setBounds(39, 30, 77, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(126, 27, 261, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//documentacion
		setTitle("Documentacion*");
		JRadioButton documentacion =new JRadioButton ("seleccione la opcion e introduzca un valor");
		JRadioButton Documentacion1 = new JRadioButton("NIF");
		JRadioButton Documentacion2 = new JRadioButton("NIE");
       
        contentPane.add(Documentacion1);
        contentPane.add(Documentacion2);
        
        /////////
        
		JPanel panel = new JPanel();
		contentPane.add(panel);

		JRadioButton nif = new JRadioButton("NIF");
		buttonGroupTipo.add(nif);
		panel.add(nif);

		JRadioButton nie = new JRadioButton("NIE");
		buttonGroupTipo.add(nie);
		panel.add(nie);

        //telefono
        
		JLabel lbltelefono = new JLabel("telefono:");
		lbltelefono.setBounds(39, 30, 77, 14);
		contentPane.add(lbltelefono);
		
		textField = new JTextField();
		textField.setBounds(126, 27, 261, 20);
		contentPane.add(textField);
		textField.setColumns(10);
        
		//fecha nacimiento
		
		JLabel lblFecha = new JLabel("Fecha nacimiento*:");
		lblFecha.setBounds(39, 63, 46, 14);
		contentPane.add(lblFecha);
		

     
	}
}
