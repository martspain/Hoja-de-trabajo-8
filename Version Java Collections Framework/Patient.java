/**
 * Hoja de trabajo 8
 * Algoritmos y Estructuras de Datos
 * Seccion: 30
 * Fecha de entrega: 1/04/2020
 * Clase Patient
 * @author Martín España
 * Ultima fecha de modificacion: 1/04/2020
 * Version: 1.0
*/

public class Patient{
	
	private String name;
	private String symptom;
	private String priorCode;
	
	public Patient(String na, String sy, String pr){
		name = na;
		symptom = sy;
		priorCode = pr;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getSymptom(){
		return this.symptom;
	}
	
	public String getPriorCode(){
		return this.priorCode;
	}
	
}