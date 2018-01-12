package com.example.bank;

import java.math.BigDecimal;

public interface Account {
	public void setAccountHolderNID(String accountHolderNID);

	public String getAccountHolderNID();

	public void addBalance(BigDecimal balance);

	public void subtractBalance(BigDecimal balance);

	public BigDecimal getBalance();

	public BigDecimal getLoanAmount();

	public void setLoanAmount(BigDecimal loanAmount);

}
