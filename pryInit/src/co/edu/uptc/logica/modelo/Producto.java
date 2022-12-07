package co.edu.uptc.logica.modelo;

public class Producto {

    private String Nombre;
    //receta harina, levadura, azucar, sal, agua,mantequilla
    private float CantSal, CantHarina, CantAgua;

    public float getCantSal() {
        return CantSal;
    }

    public void setCantSal(float cantSal) {
        CantSal = cantSal;
    }

    public float getCantHarina() {
        return CantHarina;
    }

    public float getCantAgua() {
        return CantAgua;
    }

    public void setCantAgua(float cantAgua) {
        CantAgua = cantAgua;
    }

    public void setCantHarina(float cantHarina) {
        CantHarina = cantHarina;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
