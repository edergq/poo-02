import java.util.List;
import java.util.Scanner;

import datos.PersonaDatos;
import entidades.Persona;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt = 0;
        PersonaDatos pData = new PersonaDatos();
        do {
            System.out.println("***** CRUD PERSONA *****");
            System.out.println("1 Listar ");
            System.out.println("2 Nuevo ");
            System.out.println("3 Eliminar ");
            System.out.println("0 Salir ");
            System.out.println("Seleccionar: ");
            opt = input.nextInt();
            System.out.println("Tu seleccionaste: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("****** 1 Listar *****");
                    List<Persona> lis = pData.listaPersonas;
                    System.out.println("ID \t Nombre \t Sexo");
                    for (Persona d : lis) {
                        System.out.println(d.getId() + "\t" + d.getNombre()+ "\t" + d.getSexo());
                    }
                    break;
                case 2:
                    System.out.println("**** 2 Nuevo ****");
                    Persona d = new Persona();

                    System.out.print("Ingrese Nombre: ");
                    d.setNombre(input.nextLine());
                    System.out.print("Ingrese Sexo: ");
                    d.setSexo(input.nextLine());

                    pData.create(d);
                    break;
                case 3:
                    System.out.println("**** 3 Eliminar ****");
                    System.out.print("Ingrese ID a eliminar: ");
                    pData.delete(input.nextInt());
                    input.nextLine();
                    break;

                case 9:
                    System.out.println("Salir ");
                    break;
                default:
                    System.out.println("Incorrecto");
                    break;
            }
        } while (opt != 0);

    }
}