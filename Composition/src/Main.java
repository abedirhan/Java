
public class Main {
public static void main(String[] args) {
	Resolution resolution =new Resolution(1920, 1080);
	Monitor monitor= new Monitor("vs197de", "Asus","18.5", resolution);
	Kasa kasa = new Kasa("shadow", "shade","Temperli cam" );
	Anakart anakart=new Anakart("B250", "Asus", 10, "Windows 10");
	Bilgiayar pc=new Bilgiayar(monitor, kasa, anakart);
	
	pc.getKasa().bilgisayari_ac();
	pc.getMonitor().monitoru_kapat();
	pc.getAnakart().isletim_sistemi_Yukle("Ubuntu 16.04");
	
}
}
