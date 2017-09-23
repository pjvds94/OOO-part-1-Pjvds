package domain;

public class Rechthoek {

	private int breedte;
	private int hoogte;
	private Punt linkerBovenhoek;

	public Rechthoek(Punt linkerBovenhoek, int breedte, int hoogte) {
		this.setLinkerBovenhoek(linkerBovenhoek);
		this.setHoogte(hoogte);
		this.setBreedte(breedte);
	}

	public Punt getLinkerBovenhoek() {
		return linkerBovenhoek;
	}

	private void setLinkerBovenhoek(Punt hoek) {
		if (hoek == null) {
			throw new DomainException("Mag niet null zijn");
		}
		this.linkerBovenhoek = hoek;
	}

	public int getHoogte() {
		return hoogte;
	}

	public int getBreedte() {
		return breedte;
	}

	private void setHoogte(int hoogte) {
		if (hoogte <= 0) {
			throw new DomainException("Hoogte mag niet kleiner zijn dan 0");
		}
		this.hoogte = hoogte;
	}

	private void setBreedte(int breedte) {
		if (breedte <= 0) {
			throw new DomainException("Breedte mag niet kleiner zijn dan 0");
		}
		this.breedte = breedte;
	}

	public boolean equals(Object object) {
		boolean result = false;
		if (object instanceof Rechthoek) {
			Rechthoek p = (Rechthoek) object;
			if (this.getHoogte() == p.getHoogte() && (this.getBreedte() == p.getBreedte())
					&& this.getLinkerBovenhoek().equals(p.getLinkerBovenhoek())) {
				result = true;
			}
		}
		return result;
	}

	public String toString() {
		return "Rechthoek: positie (" + this.getLinkerBovenhoek().getX() + ", " + this.getLinkerBovenhoek().getY()
				+ ") - breedte: " + breedte + " - hoogte: " + hoogte;
	}
}
