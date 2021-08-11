package Clases;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Memoria {

    private int cantidad;

    public Memoria(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void GenerarNumeracion(DefaultTableModel modelo) {
        ArrayList<Object[]> array = new ArrayList<>();

        for (int i = 0; i < this.cantidad; i++) {

            array.add(new Object[]{
                Integer.toHexString(i).toUpperCase()
            });
        }

        array.forEach(objects -> {
            modelo.addRow(objects);
        });

    }

}
