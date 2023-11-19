package com.example.servingwebcontent.controller;

import java.util.List;
import java.util.Optional;

import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.view.RedirectView;

import com.example.servingwebcontent.entity.CountryEntity;
import com.example.servingwebcontent.entity.Customer;
import com.example.servingwebcontent.form.CountryForm;
import com.example.servingwebcontent.form.CountrySearchForm;
import com.example.servingwebcontent.form.TestForm;
import com.example.servingwebcontent.repository.CountryEntityMapper;
import com.google.gson.Gson;

@Controller
public class CountryController {

	@Autowired
	private CountryEntityMapper mapper;

	/**
	 * The String class represents character strings.
	 */
	@GetMapping("/list")
	public String list(TestForm testForm) {
		// String names = "countrys";
		// List<CountryEntity> list = mapper.select(SelectDSLCompleter.allRows());
		// model.addAttribute(names, list);
		// model.addAttribute("testForm", new TestForm());
		return "list";
	}

	@PostMapping("/create")
	@ResponseBody
	public String createTestCountry(TestForm testForm){

		// create new entity
		CountryEntity entity = new CountryEntity();
		// set country cd
		entity.setMstcountrycd(testForm.getCd());
		// set country name
		entity.setMstcountrynanme(testForm.getName());
		// insert record
		mapper.insert(entity);

		// clear form attrib
		testForm.setCd("");
		testForm.setName("");

		return "这是自己写的回给前端的信息";
	}


	@GetMapping("/country")
	public String init(CountrySearchForm countrySearchForm) {

		return "country/country";
	}

	/**
	 * Represents a sequence of characters. In this context, it is used to return a
	 * JSON representation of a CountryEntity object.
	 */
	@PostMapping("/country/getCountry")
	@ResponseBody
	public String getCountry(@Validated CountrySearchForm countrySearchForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		/**
		 * Optional object containing the result of the database query for the country
		 * with the specified country code.
		 */
		Optional<CountryEntity> countryEntity = mapper.selectByPrimaryKey(countrySearchForm.getMstCountryCD());
		if (countryEntity == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}

		return new Gson().toJson(countryEntity.get());
	}


	/**
	 * Returns the name of the view template to render for creating a country.
	 *
	 * @param countryForm the form object containing the country data
	 * @return the name of the view template for adding a country
	 */
	@GetMapping("/country/create")
	public String create(CountryForm countryForm) {
		return "addCountry";
	}

	/**
	 * Creates a new country in the database based on the provided country form.
	 * 
	 * @param countryForm the country form containing the details of the country to be created
	 * @return a string message to be sent back to the frontend
	 */
	@PostMapping("/country/createCountry")
	@ResponseBody
	public String createCountry(CountryForm countryForm){

		// create new entiry
		CountryEntity countryEntity = new CountryEntity();
		countryEntity.setMstcountrycd(countryForm.getCd());
		countryEntity.setMstcountrynanme(countryForm.getName());

		// insert into database
		mapper.insert(countryEntity);

		countryForm.setCd("");
		countryForm.setName("");

		return "这是自己写的回给前端的信息";
	}
	


}
