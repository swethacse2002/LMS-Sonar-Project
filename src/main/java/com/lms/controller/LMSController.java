package com.lms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.bean.Laptop;
import com.lms.dao.LaptopDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class LMSController {

	@Autowired
	LaptopDAO dao;

	@PostMapping("/PerformInsert")
	public String performInsert(@RequestBody Laptop lap) {
		dao.save(lap);
		return "Inserted";
	}

	@PutMapping("/PerformUpdate")
	public String performUpdate(@RequestBody Laptop lap) {
		dao.save(lap);
		return "Updated";
	}

	@DeleteMapping("/PerformDelete/{lid}")
	public String performDelete(@PathVariable("lid") int lid) {
		dao.deleteById(lid);
		return "Deleted";
	}

	@GetMapping("/View")
	public List<Laptop> getAllLaptop() {
		Iterator<Laptop> it = dao.findAll().iterator();
		List<Laptop> list = new ArrayList<Laptop>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
