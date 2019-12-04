package com.example.recycledview_android.versiones;

public class Version {
    String nombre, fecha;
    double version;

    public Version(String nombre, String fecha, double version) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
