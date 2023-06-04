package Modelo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Producto {
    private int numStock;
    private String nombre;
    private float Precio;

    //constructor
    public Producto(int numStock, String nombre, float precio) {
        this.numStock = numStock;
        this.nombre = nombre;
        Precio = precio;
    }
    //geter y seter


    public int getNumStock() {
        return numStock;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    //metodos


    @Override
    public String toString() {
        return " numStock= " + numStock +
                " nombre= " + nombre +
                " Precio= " + Precio;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject json = new JSONObject();
        json.put("stock",numStock);
        json.put("nombre",nombre);
        json.put("precio",Precio);

        return json;
    }


}
