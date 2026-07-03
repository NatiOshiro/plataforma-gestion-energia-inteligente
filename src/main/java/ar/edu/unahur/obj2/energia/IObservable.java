package ar.edu.unahur.obj2.energia;

public interface IObservable {
  public void agregarObservador(IObservable suscriptor);
  public void quitarObservador(IObservable suscriptor);
  public void notificarrObservador();

}
