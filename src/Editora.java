import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Editora implements Subject_Editora {
private int n;
public  Editora(){
	observers = new LinkedList <>();
}
	private List <Observer> observers;
	
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
public void iniciar () {
	Random gerador = new Random ();
	while(true) {
	int n =	gerador.nextInt(6) +1;
	notifyObserver();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			}	
	}
}
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(n);
		}
	}

}
