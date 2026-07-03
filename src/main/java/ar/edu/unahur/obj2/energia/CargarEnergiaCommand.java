package ar.edu.unahur.obj2.energia;

public class CargarEnergiaCommand implements IComando {
  private BateriaDeAlmacenamiento bateria;
  private Integer energia;

  @Override
  public void ejecutar() {
    bateria.cargarEnergia(energia);
    ;
  }

  public CargarEnergiaCommand(BateriaDeAlmacenamiento bateria, Integer energia) {
    this.bateria = bateria;
    this.energia = energia;
  }

}
