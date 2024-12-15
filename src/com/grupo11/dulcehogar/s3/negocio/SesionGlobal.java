package com.grupo11.dulcehogar.s3.negocio;

public class SesionGlobal {
    private static SesionGlobal instancia;
    private String rutUsuario;

    private SesionGlobal() {}

    public static SesionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new SesionGlobal();
        }
        return instancia;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }
}
