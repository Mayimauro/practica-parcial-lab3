package Modelo;

import org.json.JSONException;
import org.json.JSONObject;

public class Mueble extends Producto{

    public Mueble(int numStock, String nombre, float precio) {
        super(numStock, nombre, precio);
    }
    public JSONObject toJson() throws JSONException {
        JSONObject json = super.toJson();

        return json;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
