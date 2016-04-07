package Ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;


public class Herencia4Visual {

	private JFrame frame;
	static ListinProfesores lProfesoresTitulares = new ListinProfesores();
	static ListinProfesores lProfesoresInterinos = new ListinProfesores();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Herencia4Visual window = new Herencia4Visual();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		File file = new File("recursos/profesores.csv");
		try (Scanner sc = new Scanner(file);){
			String linea = sc.nextLine();
			while (sc.hasNextLine()){
				linea = sc.nextLine();
				String[] array = linea.split(";");

				if (array[4].contains("SI")){
					lProfesoresTitulares.addProfesor(new ProfesorTitular(array[0], Integer.parseInt(array[1]), array[2], array[3], Integer.parseInt(array[5])));
				} else {
					lProfesoresInterinos.addProfesor(new ProfesorInterino(array[0], Integer.parseInt(array[1]), array[2], array[3], array[6]));
				}
				/*for(Profesor profesor : lProfesores.getListin()){
					System.out.println(profesor);
				}*/
			}
		} catch (FileNotFoundException e) {
			System.out.format("No se encuentra el archivo %s%n", file);
		}
		
	}

	/**
	 * Create the application.
	 */
	public Herencia4Visual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel cabecera = new JLabel("Seleccione una opción");
		frame.getContentPane().add(cabecera, BorderLayout.NORTH);
		
		JTextArea cuerpo = new JTextArea();
		frame.getContentPane().add(cuerpo, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton titulares = new JButton("Titulares");
		panel.add(titulares);
		titulares.addActionListener(t -> {
			cuerpo.setText("");
			for(Profesor profesor : lProfesoresTitulares.getListin()){
				cuerpo.append(profesor.toString()+"\n");
			}
		});
		
		JButton interinos = new JButton("Interinos");
		panel.add(interinos);
		interinos.addActionListener(t -> {
			cuerpo.setText("");
			for(Profesor profesor : lProfesoresInterinos.getListin()){
				cuerpo.append(profesor.toString()+"\n");
			}
		});
	}

}
