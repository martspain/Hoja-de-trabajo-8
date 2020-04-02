/**
 * Hoja de trabajo 8
 * Algoritmos y Estructuras de Datos
 * Seccion: 30
 * Fecha de entrega: 1/04/2020
 * Clase VectorHeap
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
	
	public int compareTo(Patient other){
		if(this.priorCode.equalsIgnoreCase("A")){
			if(other.getPriorCode().equalsIgnoreCase("A")){
				return 0;
			}
			else{
				return -1;
			}
		}
		else if(this.priorCode.equalsIgnoreCase("B")){
			if(other.getPriorCode().equalsIgnoreCase("A")){
				return 1;
			}
			else if(other.getPriorCode().equalsIgnoreCase("B")){
				return 0;
			}
			else{
				return -1;
			}
		}
		else if(this.priorCode.equalsIgnoreCase("C")){
			if(other.getPriorCode().equalsIgnoreCase("A")){
				return 1;
			}
			else if(other.getPriorCode().equalsIgnoreCase("B")){
				return 1;
			}
			else if(other.getPriorCode().equalsIgnoreCase("C")){
				return 0;
			}
			else{
				return -1;
			}
		}
		else if(this.priorCode.equalsIgnoreCase("D")){
			if(other.getPriorCode().equalsIgnoreCase("E")){
				return -1;
			}
			else if(other.getPriorCode().equalsIgnoreCase("D")){
				return 0;
			}
			else{
				return 1;
			}
		}
		else if(this.priorCode.equalsIgnoreCase("E")){
			if(other.getPriorCode().equalsIgnoreCase("E")){
				return 0;
			}
			else{
				return 1;
			}
		}
		return 0;
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