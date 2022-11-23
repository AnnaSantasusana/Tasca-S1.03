package collection.n2ex1;

import java.util.Objects;

public class Restaurant {

	private String name;
	private int score;
	
	public Restaurant(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}
	
	public String toString() {
		return "Name: " + this.name + " -> Score: " + this.score;
	}
}
