package com.account.repository;

import org.springframework.data.repository.CrudRepository;

import com.account.model.NewAccount;

public interface AccountRepository extends CrudRepository<NewAccount,Integer>
{
public NewAccount findById(int id);
}
