package com.example.servingwebcontent.controller;

import java.util.List;
import java.util.Optional;

import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.BeanUtils;
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

import com.example.servingwebcontent.entity.CountryEntity;
import com.example.servingwebcontent.form.CountryForm;
import com.example.servingwebcontent.form.CountrySearchForm;
import com.example.servingwebcontent.repository.CountryEntityMapper;
import com.example.servingwebcontent.utils.CommonResult;
import com.google.gson.Gson;

@Controller
public class CountryController {

	@Autowired
	private CountryEntityMapper mapper;
	
	@Autowired
	private CommonResult result;

	@Autowired
	private Gson gson;
	
	@GetMapping("/country")
	public String init(Model model) {
		model.addAttribute("searchForm", new CountrySearchForm());
		model.addAttribute("countryFrom", new CountryForm());
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

	/*
	 * 创建一个方法，监听/country/createCountry，
	 * 实现根据请求的参数创建一个CountryEntity对象，并将其插入到数据库中。
	 */
	@PostMapping("/country/createCountry")
	@ResponseBody
	public String createCountry(@RequestBody CountryEntity countryEntity) {
		// Method body goes here
		// For example, you might save the countryEntity to the database
		// Then return a success message or the saved entity
		return "Country created successfully";
	}
	
	@PostMapping("/country/create")
	@ResponseBody
	public String creat(CountryForm countryForm) {
		CountryEntity entity = new CountryEntity();
		entity.setMstcountrycd(countryForm.getMstcountrycd());
		entity.setMstcountrynanme(countryForm.getMstcountrynanme());
		mapper.insert(entity);
		result.setStatus(0);
		result.setMessage("国家加入成功");
		
		return gson.toJson(result);
	}
	
	@PostMapping("/country/update")
	@ResponseBody
	public String update(CountryForm countryForm) {
		CountryEntity entity = new CountryEntity();
		entity.setMstcountrycd(countryForm.getMstcountrycd());
		entity.setMstcountrynanme(countryForm.getMstcountrynanme());
		mapper.updateByPrimaryKey(entity);
		
		result.setStatus(0);
		result.setMessage("国家更新成功");
		
		return gson.toJson(result);
	}
	
	@PostMapping("/country/delete")
	@ResponseBody
	public String delete(CountryForm countryForm) {

		
		mapper.deleteByPrimaryKey(countryForm.getMstcountrycd());
		result.setStatus(0);
		result.setMessage("国家删除成功");
		
		return gson.toJson(result);
	}
	
	
	
	
	
	
	
	/**
	 * The String class represents character strings.
	 */
	@GetMapping("/list2")
	public String country(Model model) {
		String names = "countrynames";
		List<CountryEntity> country = mapper.select(SelectDSLCompleter.allRows());
		
		model.addAttribute(names, country);
		return "list2";
	}
	
	/**
	 * Returns the name of the view to be rendered, which is "add".
	 *
	 * @return the name of the view to be rendered
	 */
	@GetMapping("/add1")
	public String add(CountryForm countryForm) {
		//model.addAttribute("user", new CustomerForm());
		return "add1";
	}
	
	@PostMapping("/addCountry")
	@ResponseBody
	public String addCountry(@Validated CountryForm CountryForm, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
            return "add1";
        }

		CountryEntity countryEntity = new CountryEntity();
		BeanUtils.copyProperties(CountryForm, countryEntity);
		mapper.insert(countryEntity);
		CountryForm.setMstcountrycd("");
		CountryForm.setMstcountrynanme("");
		return "xixixix";
	}
	
}
