package Modelo;

import org.json.JSONException;
import org.json.JSONObject;

public class impresora extends Informatico{
    private int IPP;

    public impresora(int numStock, String nombre, float precio, String nombreFabricante, int IPP) {
        super(numStock, nombre, precio, nombreFabricante);
        this.IPP = IPP;
    }

    @Override
    public String toString() {
        return super.toString() + "impresora " +
                " IPP= " + IPP +
                "\n";
    }

    public JSONObject toJson() throws JSONException {
        JSONObject json = super.toJson();
        json.put("IPP",IPP);

        return json;
    }
}
