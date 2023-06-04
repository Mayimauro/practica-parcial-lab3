package Modelo;

import org.json.JSONException;
import org.json.JSONObject;

public class Informatico extends Producto{

    private String nombreFabricante;

    public Informatico(int numStock, String nombre, float precio,String nombreFabricante) {
        super(numStock, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }


    @Override
    public String toString() {
        return super.toString() +
                " nombreFabricante= " + nombreFabricante;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject json = super.toJson();
        json.put("quien lo fabrica",nombreFabricante);
        return json;
    }
}
