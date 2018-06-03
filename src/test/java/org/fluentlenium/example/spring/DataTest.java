package org.fluentlenium.example.spring;

import java.util.List;

import org.fluentlenium.example.spring.base.Account;
import org.fluentlenium.example.spring.util.AccountRead;
import org.junit.Test;

public class DataTest {
	
	List<Account> accounts;

	@Test
	public void tt() {
		accounts = AccountRead.getAll();
		System.out.println(accounts.size());
		for (Account account : accounts) {
			System.out.println(account.getUsername()+" = "+account.getPassword());
		}
		
	
	}

}
