package co.grandcircus.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.restaurant.Dao.RestDao;
import co.grandcircus.restaurant.Entity.Rest;

@Controller
public class RestController {
	@Autowired
	private RestDao dao;
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		List<Rest> place = dao.findAll();
		return new ModelAndView("index", "place", place);
	}
	
	@RequestMapping("/resta/up")
	public ModelAndView upRate(@RequestParam("id") Long id) {
		dao.up(id);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/resta/down")
	public ModelAndView downRate(@RequestParam("id") Long id) {
		dao.down(id);
		return new ModelAndView("redirect:/");
	}
	

	
}
