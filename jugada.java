import java.time.LocalDate;

public class jugada {
	private LocalDate fecha;
	private String palabraClave;
	private int puntaje;
	private String [] arreglo;
	private int cant;
	
	public jugada(LocalDate fecha, String palabraClave, int puntaje, int cant) {
	
		this.fecha = fecha;
		this.palabraClave = palabraClave;
		this.puntaje = puntaje;
		this.arreglo = new String[6];
		this.cant = cant;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getPalabraClave() {
		return palabraClave;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public String[] getArreglo() {
		return arreglo;
	}

	public int getCant() {
		return cant;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public void setArreglo(String[] arreglo) {
		this.arreglo = arreglo;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	public void agregarIntento (String palabra) {
		if ( cant < arreglo.length) {
			arreglo [cant] = palabra;
			cant++;
		}
	}

}

	

