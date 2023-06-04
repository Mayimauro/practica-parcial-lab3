package Modelo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class GestionProductos {

    private ArrayList<Producto> productos;

    public GestionProductos() {
        productos = new ArrayList<>();
    }
    //geter


    public ArrayList<Producto> getProductos() {
        return productos;
    }

    //metodos
    public void agregarProductos(Producto p)
    {
        productos.add(p);
    }

    public JSONObject agregarAJson() throws JSONException {
        JSONObject json = new JSONObject();
        JSONArray a = new JSONArray();
        for(Producto a1 : productos) {
            a.put(a1.toJson());
            json.put("productos", a);
        }
        return json;
    }

    public void recorrerYmostrar(int precio)
    {

        for(int i =0;i<productos.size();i++)
        {
            if(productos.get(i).getPrecio()<=precio)
            {
               System.out.println(productos.get(i).toString());
            }
        }

    }

    @Override
    public String toString() {
        return "GestionProductos " +  "\n" +
                "productos= " + productos +
                "\n";
    }
}
