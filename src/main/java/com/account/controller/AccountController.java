package com.account.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.account.model.NewAccount;
import com.account.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accService;
	
	@GetMapping("/getAll")
	public List<NewAccount> getAll()
	{
		return accService.getAll();
	}
	@PostMapping("/addData")
	public NewAccount addData(@RequestBody NewAccount acc)
	{
		NewAccount ac=accService.addData(acc);
		return ac;
	}
	@DeleteMapping("/deleteById/{id}")
	public void deleteData(int id)
	{
		accService.deleteByIdData(id);
	}
	@PutMapping("/updateDataById/{id}")
	public void updateData(@PathVariable int id,@RequestBody NewAccount acc)
	{
		accService.updateData(acc, id);
	}
	@RequestMapping("/home")
	public ModelAndView home()
	{
		ModelAndView m=new ModelAndView();
		m.addObject("message","Hello");
		m.setViewName("index");
		return m;
	}

}
