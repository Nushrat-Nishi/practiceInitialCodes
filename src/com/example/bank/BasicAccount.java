package com.example.bank;

import java.math.BigDecimal;

public abstract class BasicAccount {
	protected String accountHolderNID;
	protected BigDecimal balance = new BigDecimal(0);
	protected BigDecimal loanAmount = new BigDecimal(0);

	public void setAccountHolderNID(String accountHolderNID) {

		this.accountHolderNID = accountHolderNID;

	}

	public String getAccountHolderNID() {

		return accountHolderNID;
	}

	public void addBalance(BigDecimal balance) {

		if (balance.intValue() < 0) {
			throw new IllegalArgumentException("Balance cannot be negative.");
		} else {

			this.balance = this.balance.add(balance);
		}
	}

	public void subtractBalance(BigDecimal balance) {
		this.balance = this.balance.subtract(balance);
	}

	public BigDecimal getBalance() {

		return balance;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public abstract String toString();
}
