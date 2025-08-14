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
            System.out.println("BIENVENIDO/A AL CONVERSOR DE MONEDA DE ALURA ");
            System.out.println("********************************************\u001B[0m");
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
                    if (tasasDeConversion == null) {
                        System.out.println("Error al obtener las tasas de conversión.");
                        continue;
                    }
                    
                    // Obtener la tasa de conversión según la opción
                    Double tasaConversion = obtenerTasaConversion(opcion, tasasDeConversion);
                    
                    if (tasaConversion == null || tasaConversion == 0) {
                        System.out.println("Error: No se encontró una tasa válida para la conversión");
                        continue;
                    }

                    // Aplicar la conversión
                    double montoConvertido = monto * tasaConversion;

                    // Mostrar el resultado
                    String monedaDestino = obtenerMonedaDestino(opcion);
                    System.out.println("Monto convertido: " + montoConvertido + " " + monedaDestino);
                } else if (opcion == 7) {
                    System.out.println("¡Gracias por usar el conversor de Alura!");
                } else {
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor ingrese un número.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
        lectura.close();
    }

    private static Double obtenerTasaConversion(int opcion, Map<String, Double> tasas) {
        return switch (opcion) {
            case 1 -> tasas.get("EUR"); // Dólar a Euro
            case 2 -> 1.0 / tasas.get("EUR"); // Euro a Dólar
            case 3 -> 1.0 / tasas.get("CLP"); // Peso Chileno a Dólar
            case 4 -> tasas.get("CLP"); // Dólar a Peso Chileno
            case 5 -> tasas.get("ARS"); // Dólar a Peso Argentino
            case 6 -> 1.0 / tasas.get("ARS"); // Peso Argentino a Dólar
            default -> null;
        };
    }

    private static String obtenerMonedaDestino(int opcion) {
        return switch (opcion) {
            case 1 -> "EUR"; // Dólar a Euro
            case 2 -> "USD"; // Euro a Dólar
            case 3 -> "USD"; // Peso Chileno a Dólar
            case 4 -> "CLP"; // Dólar a Peso Chileno
            case 5 -> "ARS"; // Dólar a Peso Argentino
            case 6 -> "USD"; // Peso Argentino a Dólar
            default -> "";
        };
    }
}
