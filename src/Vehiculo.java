public abstract class Vehiculo{
private String tipo;
private int pasajeros;
private double velocidad;
private int numeroLlantas;
private boolean carga;

public Vehiculo() {

}

public Vehiculo(String tipo, int pasajeros, double velocidad ){
    this.tipo = tipo;
    this.pasajeros = pasajeros;
    this.velocidad = velocidad;

}
abstract double acelerar();

abstract double desacelerar();

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public int getPasajeros() {
    return pasajeros;
}

public void setPasajeros(int pasajeros) {
    this.pasajeros = pasajeros;
}

public double getVelocidad() {
    return velocidad;
}

public void setVelocidad(double velocidad) {
    this.velocidad = velocidad;
}

public int getNumeroLlantas() {
    return numeroLlantas;
}

public void setNumeroLlantas(int numeroLlantas) {
    this.numeroLlantas = numeroLlantas;
}

public boolean isCarga() {
    return carga;
}

public void setCarga(boolean carga) {
    this.carga = carga;
}

}


