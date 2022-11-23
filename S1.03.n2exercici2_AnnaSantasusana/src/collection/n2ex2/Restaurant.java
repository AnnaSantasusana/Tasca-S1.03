package collection.n2ex2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
	
	private String name;
	private int score;
	
	public Restaurant(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
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
	
	@Override
	public int compareTo(Restaurant o) {
		int result = 0;
		
		if(this.getName().compareTo(o.getName()) == 0) {
			if(this.score < o.score) {
				result = -1;
			} else if(this.score == o.score) {
				result = 0;
			} else {
				result = 1;
			}
		}else if(this.getName().compareTo(o.getName()) < 0) {
			result = -1;
		}else {
			result = 1;
			
		}
		return result;
	}
	

	public String toString() {
		return "Name: " + this.name + " -> Score: " + this.score;
	}
	
	
	

}
