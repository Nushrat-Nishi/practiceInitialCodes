package com.example.bank;

import com.example.bank.Account;
import com.example.bank.BasicAccount;

public class CreditCardAccount extends BasicAccount implements Account {

	@Override
	public String toString() {

		return "\nCredit card account balance for NID " + accountHolderNID
				+ " is " + balance + " and Loan is " + loanAmount.toString();
	}

}
