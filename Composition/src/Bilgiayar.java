
public class Bilgiayar {
	private Monitor monitor;
	private Kasa kasa;
	private Anakart anakart;
	
	public Bilgiayar(Monitor monitor, Kasa kasa, Anakart anakart) {
		super();
		this.monitor = monitor;
		this.kasa = kasa;
		this.anakart = anakart;
	}

	
	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Kasa getKasa() {
		return kasa;
	}

	public void setKasa(Kasa kasa) {
		this.kasa = kasa;
	}

	public Anakart getAnakart() {
		return anakart;
	}

	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}
	
	
	

}
