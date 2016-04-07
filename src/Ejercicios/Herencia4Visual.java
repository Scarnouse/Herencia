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
	ListinProfesores lista = new ListinProfesores();
	File file = new File("recursos/profesores.csv");
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
			lista.getListin().clear();
			
			try (Scanner sc = new Scanner(file);){
				String linea = sc.nextLine();
				while (sc.hasNextLine()){
					linea = sc.nextLine();
					String[] array = linea.split(";");
					if (array[4].contains("SI")){
						lista.addProfesor(new ProfesorTitular(array[0], Integer.parseInt(array[1]), array[2], array[3], Integer.parseInt(array[5])));
					}
				}
			} catch (FileNotFoundException e) {
				System.out.format("No se encuentra el archivo %s%n", file);
			}
			for(Profesor profesor : lista.getListin()){
				cuerpo.append(profesor.toString()+"\n");
			}
			
		});
		
		JButton interinos = new JButton("Interinos");
		panel.add(interinos);
		interinos.addActionListener(t -> {
			cuerpo.setText("");
			lista.getListin().clear();
			File file = new File("recursos/profesores.csv");
			try (Scanner sc = new Scanner(file);){
				String linea = sc.nextLine();
				while (sc.hasNextLine()){
					linea = sc.nextLine();
					String[] array = linea.split(";");
					if (array[4].contains("NO")){
						lista.addProfesor(new ProfesorInterino(array[0], Integer.parseInt(array[1]), array[2], array[3], array[6]));;
					}
				}
			} catch (FileNotFoundException e) {
				System.out.format("No se encuentra el archivo %s%n", file);
			}
			for(Profesor profesor : lista.getListin()){
				cuerpo.append(profesor.toString()+"\n");
			}
		});
	}

}
