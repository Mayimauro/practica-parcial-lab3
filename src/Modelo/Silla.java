package Modelo;

import org.json.JSONException;
import org.json.JSONObject;

public class Silla extends Mueble{
    private boolean tieneRuedas;

    public Silla(int numStock, String nombre, float precio, boolean tieneRuedas) {
        super(numStock, nombre, precio);
        this.tieneRuedas = tieneRuedas;
    }

    @Override
    public String toString() {
        return "Silla " +
                super.toString()+ " tieneRuedas=" + tieneRuedas +
                "\n";
    }

    public JSONObject toJson() throws JSONException {
        JSONObject json = super.toJson();
        json.put("rueditas",tieneRuedas);
        return json;
    }
}
