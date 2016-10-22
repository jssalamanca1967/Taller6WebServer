package models;

import java.util.Date;

/**
 * Created by John on 21/10/2016.
 */
public class Vuelo {

    public final static String[] estados = new String[]{"Retrasado", "En camino", "Aterrizó con éxito"};

    public Date horario;
    public String estado;

    public Vuelo(Date horario, String estado) {
        this.horario = horario;
        this.estado = estado;
    }
}
