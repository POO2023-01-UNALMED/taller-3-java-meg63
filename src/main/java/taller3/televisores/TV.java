package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	public static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
		
	}
	public Marca getMarca() {
		return marca;
	}
	public void setControl(Control control) {
		this.control=control;
	}
	
	public Control getControl() {
		return control;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
		
	}
	public int getPrecio() {
		return precio;
	
	}
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	public int getVolumen() {
		return volumen;
	}
	
	public void setCanal(int canal) {
		this.canal=canal;
	}
	
	public int getCanal() {
		return canal;
	}
	
	static int getnumTV() {
		return numTV;
	}
	
	public void turnOn() {
		if (estado==false){
			estado=true;	
		}
		
	}
	public void turnOff() {
		if (estado==true) {
			estado=false;
		}
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (estado==true) {
			if (canal >=1 && canal<120) {
				canal=canal+1;	
			}	
		}
		
	}
	public void canalDown() {
		if (estado==true) {
			if (canal >=2 && canal<=120) {
				canal=canal-1;	
			}	
		}
	}
	
	public void volumenUp() {
		if (estado==true) {
			if (volumen >=1 && volumen<120) {
				volumen=volumen+1;	
			}
		}
	}
	
	public void volumenDown() {
		if (estado==true) {
			if (volumen >=2 && volumen<=120) {
				volumen=volumen-1;	
			}
		}
	}
	

}
