package Framework.Observer;

public interface Subject {
    void registrarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers();

}
