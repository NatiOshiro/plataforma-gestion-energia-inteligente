package ar.edu.unahur.obj2.energia;

import java.util.ArrayList;
import java.util.List;

public class Plataforma implements IObservador{
  private Integer actualizacion;

  @Override
  public void actualizar(Plataforma plataforma) {
    actualizacion =  plataforma.getNivelDeEnergiaActual();
  }

  

}
