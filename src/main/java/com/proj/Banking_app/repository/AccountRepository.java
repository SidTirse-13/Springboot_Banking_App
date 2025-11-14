package com.proj.Banking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proj.Banking_app.Entity.Account;

public interface AccountRepository extends JpaRepository<Account , Long>{
	
}
