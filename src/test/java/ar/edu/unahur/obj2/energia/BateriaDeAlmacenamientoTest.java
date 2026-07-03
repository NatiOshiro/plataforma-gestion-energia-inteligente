package ar.edu.unahur.obj2.energia;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BateriaDeAlmacenamientoTest {
  @Test
  void testConsumirEnergia() {
    BateriaDeAlmacenamiento bateria = new BateriaDeAlmacenamiento("123", 10000);

    bateria.cargarEnergia(10000);
    assertEquals(bateria.getNivelDeEnergiaActual(),20000);

  }
}
