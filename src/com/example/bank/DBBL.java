package com.example.bank;

import com.example.bank.Account;
import com.example.bank.Bank;
import com.example.bank.BankAccount;
import com.example.bank.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBBL extends Bank {

	public DBBL(String bankName, List<Person> accountHolders,
			List<Account> accounts) {
		super(bankName, accountHolders, accounts);
		this.bankName = bankName;
		this.accountHolders = accountHolders;
		this.accounts = accounts;
	}

	private static String MAPKEY_BANK = "bankMapKey";
	private static String MAPKEY_CREDIT_CARD = "creditCardMapKey";
	private static String MAPKEY_Bikash = "bikashMapKey";

	private Map<String, List<Account>> accountCacheMap = new HashMap<String, List<Account>>();

	private BigDecimal sumOfAllBalance;
	private BigDecimal sumOfAllLoan;

	/*--------------------------------------------------------------*/
	public List<Account> getBankAccounts() {

		if (accountCacheMap.containsKey(MAPKEY_BANK)) {
			return accountCacheMap.get(MAPKEY_BANK);
		} else {
			List<Account> bankAccounts = new ArrayList<Account>();

			for (Account bankAcc : accounts) {
				if (bankAcc instanceof BankAccount) {
					bankAccounts.add(bankAcc);
				}
			}
			accountCacheMap.put(MAPKEY_BANK, bankAccounts);
		}
		return this.accountCacheMap.get(MAPKEY_BANK);
	}

	/*--------------------------------------------------------------*/
	public List<Account> getCreditCardAccounts() {

		if (this.accountCacheMap.containsKey(MAPKEY_CREDIT_CARD)) {
			return this.accountCacheMap.get(MAPKEY_CREDIT_CARD);
		} else {
			List<Account> creditCardAccounts = new ArrayList<Account>();

			for (Account creditCardAcc : accounts) {
				if (creditCardAcc instanceof BankAccount) {
					creditCardAccounts.add(creditCardAcc);
				}
			}

			this.accountCacheMap.put(MAPKEY_CREDIT_CARD, creditCardAccounts);
		}
		return this.accountCacheMap.get(MAPKEY_CREDIT_CARD);
	}

	/*--------------------------------------------------------------*/
	public List<Account> getBikashAccounts() {

		if (this.accountCacheMap.containsKey(MAPKEY_Bikash)) {

			return this.accountCacheMap.get(MAPKEY_Bikash);
		} else {
			List<Account> bikashAccounts = new ArrayList<Account>();

			for (Account bikashAcc : accounts) {
				if (bikashAcc instanceof BankAccount) {
					bikashAccounts.add(bikashAcc);
				}
			}

			this.accountCacheMap.put(MAPKEY_Bikash, bikashAccounts);
		}
		return this.accountCacheMap.get(MAPKEY_Bikash);
	}

	/*--------------------------------------------------------------*/
	public Person searchPerson(String nameNID) {

		for (Person accHolder : accountHolders) {
			if (nameNID.equals(accHolder.getName())
					|| nameNID.equals(accHolder.getNid())) {
				return accHolder;
			}
		}
		return null;
	}

	/*--------------------------------------------------------------*/
	public List<Account> searchAccount(Person person) {
		List<Account> listResult = new ArrayList<Account>();
		for (Account acc : accounts) {
			if (acc.getAccountHolderNID().equals(person.getNid())) {
				listResult.add(acc);
			}
		}
		return listResult;
	}

	/*--------------------------------------------------------------*/
	public BigDecimal getBalance() {

		sumOfAllBalance = new BigDecimal(0);

		for (Account acc : accounts) {

			sumOfAllBalance = sumOfAllBalance.add(acc.getBalance());
		}
		sumOfAllBalance = sumOfAllBalance.subtract(this.sumOfAllLoan);
		return sumOfAllBalance;
	}

	/*--------------------------------------------------------------*/
	@Override
	public BigDecimal getTotalLoan() {
		sumOfAllLoan = new BigDecimal(0);

		for (Account acc : accounts) {

			sumOfAllLoan = sumOfAllLoan.add(acc.getLoanAmount());
		}

		return sumOfAllLoan;
	}

	/*--------------------------------------------------------------*/
	@Override
	public String toString() {
		return "DBBL \n\n[bankName=" + bankName + ", \n\naccountHolders="
				+ accountHolders + ", \n\naccounts=\n" + accounts + "]";
	}

}
