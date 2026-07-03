package ar.edu.unahur.obj2.energia;

public class ConsumirEnergiaCommand implements IComando {
  private BateriaDeAlmacenamiento bateria;
  private Integer energia;

  @Override
  public void ejecutar() {
    bateria.consumirEnergia(energia);;
  }

  public ConsumirEnergiaCommand(BateriaDeAlmacenamiento bateria, Integer energia) {
    this.bateria = bateria;
    this.energia = energia;
  }

  @Override
  public void deshacer() {
    bateria.cargarEnergia(energia);;
  }

}
