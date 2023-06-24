import java.time.LocalDate;

public class prueba {

	public static void main(String[] args) {
		
		jugada jugada = new jugada(LocalDate.now(), "palabraClave", 10,1);
        jugada.agregarIntento("intento1");
        jugada.agregarIntento("intento2");
        System.out.println(jugada.getFecha());
        System.out.println(jugada.getPalabraClave());
        System.out.println(jugada.getPuntaje());
        System.out.println(jugada.getCant());
        
    }


	}


