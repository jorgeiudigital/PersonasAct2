package Services;

import model.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaService {
    private List<Persona> personas = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void capturarPersona(int cantidad) {
        // Implementación del método para capturar una persona

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el apellido de la persona: ");
            String apellido = sc.nextLine();

            System.out.print("Ingrese el genero de la persona: ");
            String genero = sc.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            Persona p = new Persona(nombre, apellido, genero, edad);
            personas.add(p);
        }
    }
}
