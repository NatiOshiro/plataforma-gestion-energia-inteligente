package ar.edu.unahur.obj2.energia;

import java.util.ArrayList;
import java.util.List;

public class Plataforma implements IObservador{
  private Integer actualizacion;

  public void actualizar(BateriaDeAlmacenamiento bateria) {
    actualizacion =  bateria.getNivelDeEnergiaActual();
  }

}
