import java.util.*;
import java.io.File;
import java.io.IOException;

/**
 * Hoja de trabajo 8
 * Algoritmos y Estructuras de Datos
 * Seccion: 30
 * Fecha de entrega: 1/04/2020
 * Clase Controller
 * @author Martín España
 * Ultima fecha de modificacion: 1/04/2020
 * Version: 1.0
*/

public class Controller{
	PriorityQueue<Patient> list = new PriorityQueue(4, new PatientComparator());
	
	/**
	 * Metodo que contiene el menu del programa	
	*/
	public void runProgram(){
		boolean active = true;
		Scanner input = new Scanner(System.in);
		
		this.readFile();
		
		while(active){
			System.out.println("**********Menu**********");
			System.out.println("Que desea hacer?");
			System.out.println("1. Ver siguiente paciente \n2. Salir");
			
			try{
				int answer = input.nextInt();
				
				if(answer == 1){
					this.showNext();
				}
				
				else if(answer == 2){
					System.out.println("\n");
					System.out.println("Gracias por utilizar el ordenador de prioridades del hospital SalvaVidas.");
					active = false;
				}
				
				else{
					System.out.println("\n");
					System.out.println("Por favor, ingrese una opcion valida...");
					System.out.println("\n");
				}
				
			}
			catch(Exception e){
				System.out.println("\n");
				System.out.println("ERROR: DEBE INGRESAR UN NUMERO...");
				System.out.println("\n");
				active = false;
			}
		}
	}
	
	/**
	 * Metodo que lee el archivo txt y almacena la informacion en el PriorityQueue
	*/
	public void readFile(){
		File file = new File("Pacientes.txt");
		
		try{
			Scanner reader = new Scanner(file);
			
			while(reader.hasNext()){
				String line = reader.nextLine();
				if(line.indexOf(",") >= 0){
					String[] words = line.split(",");
					String name = words[0];
					String cause = words[1];
					String code = "";
					if(words[2].indexOf(" ") >= 0){
						code = words[2].replace(" ", "");
					}
					Patient intern = new Patient(name, cause, code);
					list.add(intern);
				}
			}
			
		}
		catch(Exception e){
			System.out.println("\n");
			System.out.println("Por favor, revise el archivo de texto Pacientes.txt");
			System.out.println("\n");
		}
	}
	
	/**
	 * Metodo que muestra en pantalla el siguiente paciente a ser atendido
	*/
	public void showNext(){
		if(!list.isEmpty()){
			Patient next = list.poll();
			System.out.println("\n");
			System.out.println(next.getName() + ", " + next.getSymptom() + ", " + next.getPriorCode());
			System.out.println("\n");
		}
		else{
			System.out.println("\n");
			System.out.println("Por ahora no hay pacientes pendientes. Actualice las fichas de pacientes en el archivo Pacientes.txt");
			System.out.println("\n");
		}
	}
}