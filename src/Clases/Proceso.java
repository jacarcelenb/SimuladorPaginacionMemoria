package Clases;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class Proceso {

    private int tam_memoria;
    private String descripcion;
    private int tiempo;
    private int tam;
    private boolean espera;

    public Proceso() {
    }

    public Proceso(int tam_memoria, String descripcion, int tiempo, int tam) {
        this.tam_memoria = tam_memoria;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.tam = tam;
    }

    public Proceso(int tam_memoria, String descripcion, int tiempo, int tam, boolean espera) {
        this.tam_memoria = tam_memoria;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.tam = tam;
        this.espera = espera;
    }

    public int getTam_memoria() {
        return tam_memoria;
    }

    public void setTam_memoria(int tam_memoria) {
        this.tam_memoria = tam_memoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public boolean isEspera() {
        return espera;
    }

    public void setEspera(boolean espera) {
        this.espera = espera;
    }

    public void GenerarProceso(DefaultTableModel modelo, int tam) {
        ArrayList<Object[]> array = new ArrayList<>();

        for (int i = 0; i < tam; i++) {
            this.setDescripcion("PROCESO " +(i));
            this.setTam(Generartam());
            this.setTiempo(Generartiempo());
            array.add(new Object[]{
                this.getDescripcion(),
                this.getTam(),
                this.getTiempo()
            });
        }

        for (Object[] objects : array) {
            modelo.addRow(objects);
        }

    }

    public char GenerarProcesoId() {
        Random aleatorio = new Random();
        int n = aleatorio.nextInt((90 - 65 )+ 1) + 65;
        return (char) n;
    }

    public int Generartam() {
        Random aleatorio = new Random();
        int tam11 = aleatorio.nextInt((this.tam_memoria - 1) - 1 + 1) + 1;
        return tam11;
    }

    public int Generartiempo() {
        Random aleatorio = new Random();
        int tiempo2 = aleatorio.nextInt((500 - 50) + 1) + 50;
        return tiempo2;
    }

  

}
