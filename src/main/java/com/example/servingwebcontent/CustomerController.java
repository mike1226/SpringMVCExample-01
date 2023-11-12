package com.example.servingwebcontent;

import java.util.List;

import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.servingwebcontent.entity.Customer;
import com.example.servingwebcontent.repository.CustomerMapper;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerMapper mapper;

	@GetMapping("/customer")
	@ResponseBody
	public String hello() {
		String names = "";
		for(Customer item:mapper.select(SelectDSLCompleter.allRows())) {
			names += item.getUsername().concat("</br>");
		}
		return names;
	}

	@GetMapping("/list")
	public String list(Model model) {
		String names = "users";
		List<Customer> list = mapper.select(SelectDSLCompleter.allRows());
		
		model.addAttribute(names, list);
		return "list";
	}
}
