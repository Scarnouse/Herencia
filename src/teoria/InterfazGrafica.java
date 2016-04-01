package teoria;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazGrafica {

	private JFrame frame;
	private List<Motocicleta> lista = new ArrayList<Motocicleta>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazGrafica window = new InterfazGrafica();
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
	public InterfazGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 2));
		JLabel etiquetaPropietario = new JLabel("Propietario");
		frame.getContentPane().add(etiquetaPropietario);
		JTextField campoPropietario = new JTextField(10);
		frame.getContentPane().add(campoPropietario);
		JLabel etiquetaNumeroPasajeros = new JLabel("Numero de Pasajeros");
		frame.getContentPane().add(etiquetaNumeroPasajeros);
		JTextField campoNumeroPasajeros = new JTextField(10);
		frame.getContentPane().add(campoNumeroPasajeros);
		JLabel etiquetaCilindrada = new JLabel("Cilindrada");
		frame.getContentPane().add(etiquetaCilindrada);
		JTextField campoCilindrada = new JTextField(10);
		frame.getContentPane().add(campoCilindrada);
		JButton botonCrear = new JButton("Crear");
		frame.getContentPane().add(botonCrear);
		JButton botonSalir = new JButton("Salir");
		frame.getContentPane().add(botonSalir);
		frame.pack();
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//método guardarLista
				Auxiliar.guardar(lista);
				System.out.println(lista);
				System.exit(0);
			}
		});


		botonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String propietario = campoPropietario.getText();
				int numeroPasajeros = Integer.parseInt(campoNumeroPasajeros.getText());
				int cilindrada = Integer.parseInt(campoCilindrada.getText());
				//Motocicleta moto = new Motocicleta(propietario, numeroPasajeros, cilindrada);
				//System.out.println(moto);
				lista.add(new Motocicleta(propietario, numeroPasajeros, cilindrada));
				campoPropietario.setText("");
				campoNumeroPasajeros.setText("");
				campoCilindrada.setText("");
				}
			});
		
				
		
	}

}
