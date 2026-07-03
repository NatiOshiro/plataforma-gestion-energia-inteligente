package ar.edu.unahur.obj2.energia;

import javax.management.RuntimeErrorException;

public class BateriaDeAlmacenamiento {
  private String identificador;
  private Integer nivelDeEnergiaActual;

  public BateriaDeAlmacenamiento(String identificador, Integer nivelDeEnergiaActual) {
    this.identificador = identificador;
    this.nivelDeEnergiaActual = nivelDeEnergiaActual;
  }

  public String getIdentificador() {
    return identificador;
  }

  public Integer getNivelDeEnergiaActual() {
    return nivelDeEnergiaActual;
  }

  public void cargarEnergia(Integer unValor) {
    if(nivelDeEnergiaActual + unValor <=0){
      throw new RuntimeException("Valores Invalidos");
    }
    nivelDeEnergiaActual += unValor;
  }

  public void consumirEnergia(Integer unValor) {

  if(nivelDeEnergiaActual - unValor <= -5000){
    throw new RuntimeException("Limite de reserva");
  }
    nivelDeEnergiaActual -= unValor;
  }

}
