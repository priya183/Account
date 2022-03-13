package com.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.account.model.NewAccount;
import com.account.repository.AccountRepository;



@Service
public class AccountService {

	@Autowired
	private AccountRepository accRepo;
	
	public NewAccount addData(NewAccount acc)
	{
		NewAccount accc=accRepo.save(acc);
		return acc;
	}
	public List<NewAccount> getAll()
	{
		List<NewAccount> list=(List<NewAccount>) accRepo.findAll();
		return list;
	}
    public void deleteByIdData(int id)
    {
    	accRepo.deleteById(id);
    }
    public void updateData(NewAccount acc,int id)
    {
    	accRepo.save(acc);
    }
}
