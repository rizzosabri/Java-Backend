import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Ingrese el tipo de producto que quiere crear: " +
                        "(bebida,limpieza,carne) o salir para terminar");
                String tipoProducto = scanner.next().toLowerCase();
                if (tipoProducto.equals("salir")) {
                    System.out.println("se ha finalizado el programa");
                    break;
                }
                if (!(tipoProducto.equals("bebida") || tipoProducto.equals("limpieza") ||
                        tipoProducto.equals("carne"))) {
                    throw new IllegalArgumentException("TIPO DE PRODUCTO NO VÁLIDO.");
                }


                System.out.println("Ingrese nombre del producto:");
                String nombre = scanner.next();
                System.out.println("Ingrese precio del producto:");
                double precio = scanner.nextDouble();
                System.out.println("Ingrese fecha de caducidad del producto (YYYY-MM-DD):");
                String fechaCaducidadStr = scanner.next();
                LocalDate fechaCaducidad = LocalDate.parse(fechaCaducidadStr);

                Producto producto = null;

                switch (tipoProducto) {
                    case "bebida":
                        System.out.println("ingrese el contenido de calorias de esta bebida: ");
                        int calorias = Integer.parseInt(scanner.next());
                        producto = new Bebida(nombre, precio, fechaCaducidad, calorias);
                        break;
                    case "limpieza":
                        producto = new PoductoLimpieza(nombre, precio, fechaCaducidad);
                        break;
                    case "carne":
                        System.out.println("ingrese el contenido de calorias de la carne: ");
                        int caloriasCarne = Integer.parseInt(scanner.next());
                        producto = new Carne(nombre, precio, fechaCaducidad, caloriasCarne);
                        break;

                }

                productos.add(producto);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("entrada inválida. Por favor, vuelva a intentarlo e ingrese un valor" +
                        " válido.");
                scanner.next();
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha inválido.Vuelve a intentarlo"
                );
            }
        }

        System.out.println(productos);

        for (Producto producto : productos) {
            if (producto instanceof Carne) {
                ((Carne) producto).aplicarDescuento();
            }
        }

        System.out.println("Lista con descuentos correspondientes aplicados:" + productos);

        double totalDePrecios = costoDeTodosLosProductosCreados(productos);
        double totalCostoAlimentos = costoEnProductosAlimenticios(productos);
        double totalCostoNoAlimentos = totalDePrecios - totalCostoAlimentos;
        System.out.println("La suma de los precios de los alimentos creados es de: " + totalCostoAlimentos);
        System.out.println("La suma de los precios de los PRODUCTOS QUE NO SON ALIMENTOS creados es de: " + totalCostoNoAlimentos);
    }

    private static double costoDeTodosLosProductosCreados(ArrayList<Producto> productos) {
        double costoProductos = 0;
        for (Producto producto : productos) {
            costoProductos += producto.getPrecio();
        }
        return costoProductos;
    }

    private static double costoEnProductosAlimenticios(ArrayList<Producto> productos) {
        double costoAlimentos = 0;
        for (Producto producto : productos) {
            if (producto instanceof EsAlimento) {
                costoAlimentos += producto.getPrecio();
            }
        }
        return costoAlimentos;
    }


}