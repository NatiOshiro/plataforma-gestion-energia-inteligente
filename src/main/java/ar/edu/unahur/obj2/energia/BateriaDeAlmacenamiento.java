package ar.edu.unahur.obj2.energia;

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
    nivelDeEnergiaActual += unValor;
  }

  public void consumirEnergia(Integer unValor) {
    nivelDeEnergiaActual -= unValor;
  }

}
