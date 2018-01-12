package com.example.bank;

import com.example.bank.Account;
import com.example.bank.Person;

import java.math.BigDecimal;
import java.util.List;

public abstract class Bank {
	protected String bankName;
	protected List<Person> accountHolders;

	protected List<Account> accounts;

	public Bank(String bankName, List<Person> accountHolders,
			List<Account> accounts) {
		this.bankName = bankName;
		this.accountHolders = accountHolders;

		this.accounts = accounts;
	}

	/*--------------------------------------------------------------*/
	public String getBankName() {

		return bankName;
	}

	public List<Person> getAccountHolders() {
		return accountHolders;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	abstract BigDecimal getBalance();

	abstract BigDecimal getTotalLoan();

	abstract Person searchPerson(String nameNID);

	abstract List<Account> searchAccount(Person person);

	abstract List<Account> getBankAccounts();

	abstract List<Account> getCreditCardAccounts();

	abstract List<Account> getBikashAccounts();

}
