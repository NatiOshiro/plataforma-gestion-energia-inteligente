package ar.edu.unahur.obj2.energia;

import java.util.ArrayList;
import java.util.List;

public class OrquestacionDeEnergia {

  private List <IComando> rutinas = new ArrayList<>();

  public void agregarRutina(IComando unaRutina){
    rutinas.add(unaRutina);
  }

  public void borrarRutina(IComando unaRutina){
    rutinas.remove(unaRutina);
  }

  public void ejecutarComando(){
    rutinas.forEach(r -> r.ejecutar());
    rutinas.clear();
  }

  public void ejecutar(IComando operacion){
    operacion.ejecutar();
  }
}
