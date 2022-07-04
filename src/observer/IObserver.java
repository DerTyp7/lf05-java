package observer;

public interface IObserver {
    void notify(ICommand command);
}
