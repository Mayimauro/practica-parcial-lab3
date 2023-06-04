import Modelo.*;
import org.json.JSONException;

public class Main {
    public static void main(String[] args)  throws JSONException {
        GestionProductos galpon1 = new GestionProductos();

        Producto notebook1 = new Notebook(10, "asus", 150, "asus", 500);
        Producto silla1 = new Silla(10, "silla gamer", 200, true);
        Producto escritorio1 = new Escritorio(10, "escritorio gamer", 300, 10, 10);
        Producto impresora1 = new impresora(10, "impresore gamer", 400, "epson", 10);

        galpon1.agregarProductos(notebook1);
        galpon1.agregarProductos(silla1);
        galpon1.agregarProductos(escritorio1);
        galpon1.agregarProductos(impresora1);

        JsonUtiles.grabar(galpon1.agregarAJson(), "productos");

        System.out.println(JsonUtiles.leer("productos"));

        System.out.println("\n");

      galpon1.recorrerYmostrar(200);







    }
}