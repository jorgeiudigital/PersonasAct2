package Services;

import model.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaService {

    private static final int CANTIDAD_PERSONAS = 5;
    private static Persona[] personas = new Persona[CANTIDAD_PERSONAS];
    private Scanner sc = new Scanner(System.in);

    public void capturarPersonas() {

        for (int i = 0; i < CANTIDAD_PERSONAS; i++) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el apellido de la persona: ");
            String apellido = sc.nextLine();

            System.out.print("Ingrese el genero de la persona: ");
            String genero = sc.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = sc.nextInt();
            sc.nextLine();

            Persona p = new Persona(nombre, apellido, genero, edad);
            personas[i] = p;

            System.out.println("");
            System.out.println("Persona capturada");
            System.out.println("Ingrese la siguiente persona");
        }
    }

    public void returnNombreGenero() {
        for (int i = 0; i < CANTIDAD_PERSONAS; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + ", Genero: " + personas[i].getGenero());
        }
    }

    public double returnPromedioEdad() {
        double suma = 0; // sumatorio
        for (int i = 0; i < CANTIDAD_PERSONAS; i++) {
            suma += personas[i].getEdad();
        }
        return suma / CANTIDAD_PERSONAS;

    }

    public void cantidadMaculino() {
        int contador = 0;
        for (int i = 0; i < CANTIDAD_PERSONAS; i++) {
            if (personas[i].getGenero().equalsIgnoreCase("masculino")) {
                contador++;
            }
        }
        System.out.println("Cantidad de personas de género masculino: " + contador);

    }

    public void cantidadFemenino() {
        int contador = 0;
        for (int i = 0; i < CANTIDAD_PERSONAS; i++) {
            if (personas[i].getGenero().equalsIgnoreCase("femenino")) {
                contador++;
            }
        }
        System.out.println("Cantidad de personas de género femenino: " + contador);
    }

}

