import Services.PersonaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonaService ps = new PersonaService();

        int opcion = 0;

        do {
            System.out.println("Menu de opciones: ");
            System.out.println("1. Capturar personas");
            System.out.println("2. Mostrar nombres y géneros");
            System.out.println("3. Mostrar promedio de edad");
            System.out.println("4. Mostrar cantidad de personas masculinas");
            System.out.println("5. Mostrar cantidad de personas femeninas");
            System.out.println("6. salir del menu");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    ps.capturarPersonas();
                    break;
                case 2:
                    ps.returnNombreGenero();
                    break;
                case 3:
                    System.out.println("El promedio de edad es: " + ps.returnPromedioEdad());
                    break;
                case 4:
                    ps.cantidadMaculino();
                    break;
                case 5:
                    ps.cantidadFemenino();
                    break;
                case 6:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
        while(opcion != 6);
        System.out.println("Gracias por usar el programa.");
    }
}
