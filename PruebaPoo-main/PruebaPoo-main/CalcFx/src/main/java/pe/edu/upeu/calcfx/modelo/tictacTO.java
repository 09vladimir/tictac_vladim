package pe.edu.upeu.calcfx.modelo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class tictacTO {

    public class Jugador {
        private String nombre;
        private int puntuacion;

        public Jugador(String nombre, int puntuacion) {
            this.nombre = nombre;
            this.puntuacion = puntuacion;
        }

        // Getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public void setPuntuacion(int puntuacion) {
            this.puntuacion = puntuacion;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Puntuación: " + puntuacion;
        }
    }


}
