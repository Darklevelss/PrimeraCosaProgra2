package co.edu.uptc.logica.control;

import co.edu.uptc.logica.modelo.Producto;

import java.util.ArrayList;
import java.util.Random;

public class CalculoInsumos {
    private Producto mogolla;
    /*
    public ArrayList<Producto> listaProductosEmpresa(){
        return
    }
    */
    public Producto nuevoProducto(String Nombre){
        Producto p= new Producto();
        /*ingredientes aleatoreos
        Agua =10-25
        sal=0.01y0.08
        harina 3 agua
        * */
        p.setNombre(Nombre);
        p.setCantSal(new Random().nextFloat(25-10)+10);
        p.setCantAgua(new Random().nextFloat(25-10)+10);
        p.setCantHarina(p.getCantAgua()*3);
        return p;
    }
}
