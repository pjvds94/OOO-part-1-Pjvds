package domain;
import domain.Punt;

public class Omhullende{
	
	private Punt linkerbovenhoek;
	private int breedte;
	private int hoogte;
	
	public Omhullende(Punt linkerBovenhoek, int breedte, int hoogte){
		this.setLinkerBovenhoek(linkerBovenhoek);
		this.setHoogte(hoogte);
		this.setBreedte(breedte);
	}
	
	
	public void setLinkerBovenhoek(Punt linkerbovenhoek) {
		if(linkerbovenhoek == null) throw new DomainException("Punt kan niet gelijk aan 0 zijn!");
		this.linkerbovenhoek = linkerbovenhoek;
	}
	public void setBreedte(int breedte) {
		if(breedte < 0) throw new DomainException("Breedte kan niet kleiner dan 0 zijn!");
		this.breedte = breedte;
	}
	public void setHoogte(int hoogte) {
		if(hoogte < 0) throw new DomainException("Hoogte kan niet kleiner dan 0 zijn!");
		this.hoogte = hoogte;
	}
	
	public int getBreedte() {
		return breedte;
	}
	
	public Punt getLinkerBovenhoek() {
		return linkerbovenhoek;
	}
	
	public int getHoogte(){
		
		return this.hoogte;
	}

	public int getMinX(){
		return this.getLinkerBovenhoek().getX();
	}
	
	public int getMaxX(){
		return this.getMinX()+this.getBreedte();
	}
	
	public int getMinY(){
		return this.getLinkerBovenhoek().getY();
	}
	
	public int getMaxY(){
		return this.getMinY() +this.getHoogte();
	}
	
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Omhullende)) return false;
		Omhullende omhullende = (Omhullende) obj;
		return (this.linkerbovenhoek.equals(omhullende.linkerbovenhoek) && this.breedte == omhullende.breedte &&  this.hoogte == omhullende.hoogte);
	}

	
	public Omhullende getOmhullende() {
		return this;
	}

	public String toString(){
		return "Omhullende: " + this.getLinkerBovenhoek().toString() + " - "+this.getBreedte()+" - "+this.getHoogte();
	}
	
	
	
}
