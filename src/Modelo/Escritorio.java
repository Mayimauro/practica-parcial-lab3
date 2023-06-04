package Modelo;

import org.json.JSONException;
import org.json.JSONObject;

public class Escritorio extends Mueble{
    private double alto;
    private double ancho;

    public Escritorio(int numStock, String nombre, float precio, double alto, double ancho) {
        super(numStock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return super.toString() +"Escritorio " +
                " alto= " + alto +
                " ancho= " + ancho +
                "\n";
    }

    public JSONObject toJson() throws JSONException {
        JSONObject json = super.toJson();
        json.put("altura",alto);
        json.put("anchura",ancho);
        return json;
    }
}
