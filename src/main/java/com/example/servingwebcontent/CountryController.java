package com.example.servingwebcontent;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.example.servingwebcontent.entity.CountryEntity;
import com.example.servingwebcontent.form.CountrySearchForm;
import com.example.servingwebcontent.repository.CountryEntityMapper;
import com.google.gson.Gson;

@Controller
public class CountryController {

	@Autowired
	private CountryEntityMapper mapper;

	@GetMapping("/Country")
	public String init(CountrySearchForm countrySearchForm) {

		return "country/country";
	}

	/**
	 * Represents a sequence of characters. In this context, it is used to return a
	 * JSON representation of a CountryEntity object.
	 */
	@PostMapping("/Country/GetCountry")
	@ResponseBody
	public String getCountry(@Validated CountrySearchForm countrySearchForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
		}

		Optional<CountryEntity> countryEntity = mapper.selectByPrimaryKey(countrySearchForm.getMstCountryCD());
		if (countryEntity.get() == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		return new Gson().toJson(countryEntity.get());
	}

}
