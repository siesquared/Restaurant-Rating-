package co.grandcircus.restaurant.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "places")
public class Rest {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double rating;
	
	
	public Rest() {
		super();
		
	}
	

	
	public String toString() {
		return "Rest [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}


	public Rest(Long id, String name, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
}
