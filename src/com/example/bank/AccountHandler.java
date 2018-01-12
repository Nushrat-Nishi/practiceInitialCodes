package com.example.bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountHandler {

	public static void main(String[] args) {

		Account bankAccount1 = new BankAccount();
		bankAccount1.setAccountHolderNID("123456");
		bankAccount1.addBalance(new BigDecimal("300000"));
		bankAccount1.setLoanAmount(new BigDecimal("50"));

		Account creditCardAccount1 = new CreditCardAccount();
		creditCardAccount1.setAccountHolderNID("123456");
		creditCardAccount1.addBalance(new BigDecimal("15.58"));
		creditCardAccount1.setLoanAmount(new BigDecimal("10"));

		Account bikashAccount1 = new BikashAccount();
		bikashAccount1.setAccountHolderNID("123456");
		bikashAccount1.addBalance(new BigDecimal("9.999"));
		bikashAccount1.setLoanAmount(new BigDecimal("15"));

		Account bankAccount2 = new BankAccount();
		bankAccount2.setAccountHolderNID("147896");
		bankAccount2.addBalance(new BigDecimal("192.09"));
		bankAccount2.setLoanAmount(new BigDecimal("60"));

		Account creditCardAccount2 = new CreditCardAccount();
		creditCardAccount2.setAccountHolderNID("147896");
		creditCardAccount2.addBalance(new BigDecimal("88.008"));
		creditCardAccount2.setLoanAmount(new BigDecimal("7"));

		Account bikashAccount2 = new BikashAccount();
		bikashAccount2.setAccountHolderNID("147896");
		bikashAccount2.addBalance(new BigDecimal("0.001"));
		bikashAccount2.setLoanAmount(new BigDecimal("80"));

		Account bankAccount3 = new BankAccount();
		bankAccount3.setAccountHolderNID("159632");
		bankAccount3.addBalance(new BigDecimal("8.99"));
		bankAccount3.setLoanAmount(new BigDecimal("20"));

		Account creditCardAccount3 = new CreditCardAccount();
		creditCardAccount3.setAccountHolderNID("159632");
		creditCardAccount3.addBalance(new BigDecimal("10.91"));
		creditCardAccount3.setLoanAmount(new BigDecimal("30"));

		Account bikashAccount3 = new BikashAccount();
		bikashAccount3.setAccountHolderNID("159632");
		bikashAccount3.addBalance(new BigDecimal("12.0"));
		bikashAccount3.setLoanAmount(new BigDecimal("400"));

		List<Account> accountList = new ArrayList<Account>();
		accountList.add(bankAccount1);
		accountList.add(bankAccount2);
		accountList.add(bankAccount3);

		accountList.add(creditCardAccount1);
		accountList.add(creditCardAccount2);
		accountList.add(creditCardAccount3);

		accountList.add(bikashAccount1);
		accountList.add(bikashAccount2);
		accountList.add(bikashAccount3);

		Person person1 = new Person();
		person1.setName("p3");
		person1.setNid("159632");

		Person person2 = new Person();
		person2.setName("p1");
		person2.setNid("123456");

		Person person3 = new Person();
		person3.setName("p2");
		person3.setNid("147896");

		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		/*--------------------------------------------------------------------------------*/
		DBBL dbbl = new DBBL("Dutch Bangla Bank", personList, accountList);

		/*--------------------------------------------------------------------------------*/
		String nameNID = "147896";

		Person searchedPerson = dbbl.searchPerson(nameNID);

		List<Account> searchedAccList = new ArrayList<Account>();
		searchedAccList = dbbl.searchAccount(searchedPerson);

		System.out.println("********************************************");
		System.out.println("Searched Account List: \n" + searchedAccList);
		System.out.println("********************************************");
		System.out.println(dbbl);
		System.out.println("********************************************");
		dbbl.getTotalLoan();
		System.out.println("Get Total Balance Of All Accounts: "
				+ dbbl.getBalance());
		System.out.println("Get Total Loans Of All Accounts: "
				+ dbbl.getTotalLoan());
		System.out.println("********************************************");

		System.out.println("Only Bank Accounts:  " + dbbl.getBankAccounts());

		System.out.println("\nOnly Credit Card Accounts:  "
				+ dbbl.getCreditCardAccounts());

		System.out.println("\nOnly Bikash Accounts:  "
				+ dbbl.getBikashAccounts());
		System.out.println("********************************************");
		System.out.println("Unsorted By Name: "+personList);
		Collections.sort(personList, new PersonNameComparator());
		System.out.println("Sorted By Name: "+personList);
		System.out.println("********************************************");

	}
}
