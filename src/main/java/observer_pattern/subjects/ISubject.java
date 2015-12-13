package observer_pattern.subjects;

import observer_pattern.observers.IObserver;

interface ISubject {

	void registerObserver(IObserver o);
	void removeObserver(IObserver o);
	void notifyObservers();

}
