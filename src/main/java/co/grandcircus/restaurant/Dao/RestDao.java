package co.grandcircus.restaurant.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import co.grandcircus.restaurant.Entity.Rest;

@Repository
@Transactional
public class RestDao {
 

	@PersistenceContext
	private EntityManager em;
	
	public List<Rest> findAll(){
		List<Rest> goods = em.createQuery("FROM Rest",Rest.class) 
				.getResultList();
		return goods;
	}
	
	public void up(long id) {
		Rest place = em.getReference(Rest.class, id);
		double increase = place.getRating() + 1;
		if(increase > 10) {
			place.setRating(10);
		}else {
			place.setRating(increase);
		}
		
		em.merge(place);
	}
	
	public void down(long id) {
		Rest place = em.getReference(Rest.class, id);
		double decrease = place.getRating() - 1;
		if(decrease < -1) {
			place.setRating(-1);
		}else {
			place.setRating(decrease);
		}
		em.merge(place);
	}
	
	
}
