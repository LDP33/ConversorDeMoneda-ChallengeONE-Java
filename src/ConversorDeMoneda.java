import java.util.Map;
import java.util.Scanner;

public class ConversorDeMoneda {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMonedaApi consulta = new ConsultaMonedaApi();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n");
            System.out.println("\u001B[1;33m********************************************");
            System.out.println("          BIENVENIDO/A AL CONVERSOR DE MONEDA DE ALURA        ");
            System.out.println("******************************************\u001B[0m");
            System.out.println("1- DÓLAR a EURO");
            System.out.println("2- EURO a DÓLAR");
            System.out.println("3- PESO CHILENO a DÓLAR");
            System.out.println("4- DÓLAR a PESO CHILENO");
            System.out.println("5- DÓLAR a PESO ARGENTINO");
            System.out.println("6- PESO ARGENTINO a DÓLAR");
            System.out.println("7- SALIR ");
            System.out.print("Elija una opción válida: ");
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++");

            try {
                opcion = Integer.parseInt(lectura.nextLine());

                if (opcion >= 1 && opcion <= 6) {
                    System.out.print("Ingrese la cantidad que desea convertir: ");
                    double monto = Double.parseDouble(lectura.nextLine().replace(",", ""));

                    Map<String, Double> tasasDeConversion = consulta.obtenerTasasConversion();
                    if (tasas == null) {
                        System.out.println("Error al obtener las tasas de conversión.");
                        continue;
                        }

    }
