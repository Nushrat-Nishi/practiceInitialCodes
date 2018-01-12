package com.example.bank;

import com.example.bank.Account;
import com.example.bank.BasicAccount;

public class BikashAccount extends BasicAccount implements Account {

	@Override
	public String toString() {

		return "\nBikash account balance for NID " + accountHolderNID + " is "
				+ balance + " and Loan is " + loanAmount.toString();
	}

}
