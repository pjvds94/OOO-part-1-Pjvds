package domain;

public class Speler {

	private String naam;
	private int score;

	public Speler(String naam, int Score) {
		setNaam(naam);
		setScore(score);
	}

	public Speler(String naam) {
		setNaam(naam);
		setScore(0);
	}

	private void setNaam(String naam) {
		if (naam == null || naam.trim().isEmpty()) {
			throw new DomainException("Naam mag niet leeg zijn!");
		} else {
			this.naam = naam;
		}
	}

	private void setScore(int score) {
		if (score < 0) {
			throw new DomainException("Score mag niet kleiner dan 0 zijn!");
		}
		this.score = score;
	}

	public String getNaam() {
		return naam;
	}

	public int getScore() {
		return score;
	}

	public void addToScore(int score) {
		this.setScore(this.getScore() + score);
	}

	public boolean equals(Object object) {
		boolean result = false;
		if (object instanceof Speler) {
			Speler p = (Speler) object;
			if (this.getNaam().equals(p.getNaam()) && (this.getScore() == p.getScore())) {
				result = true;
			}
		}
		return result;
	}

	public String ToString() {
		return this.getNaam() + " heeft als score: " + this.getScore();
	}

}
