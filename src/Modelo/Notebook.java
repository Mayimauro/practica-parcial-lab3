package Modelo;

import org.json.JSONException;
import org.json.JSONObject;

public class Notebook extends Informatico{
    private int GB;

    public Notebook(int numStock, String nombre, float precio, String nombreFabricante, int GB) {
        super(numStock, nombre, precio, nombreFabricante);
        this.GB = GB;
    }

    @Override
    public String toString() {
        return "Notebook " +
                " GB= " + GB +
                super.toString()+
                "\n";
    }

    public JSONObject toJson() throws JSONException {
        JSONObject json = super.toJson();
        json.put("cantidad de gigas",GB);

        return json;
    }
}
