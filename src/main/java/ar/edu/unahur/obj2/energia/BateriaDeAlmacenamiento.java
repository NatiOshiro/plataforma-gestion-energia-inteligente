package ar.edu.unahur.obj2.energia;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class BateriaDeAlmacenamiento implements IObservable{
  private String identificador;
  private Integer nivelDeEnergiaActual;

  private List<IObservable> suscriptores = new ArrayList<>();

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

  @Override
  public void agregarObservador(IObservable suscriptor) {
    suscriptores.add(suscriptor);
  }

  @Override
  public void quitarObservador(IObservable suscriptor) {
    suscriptores.remove(suscriptor);
  }

  @Override
  public void notificarrObservador() {
    suscriptores.forEach(s -> s.actualizar(this));;
  }

}
