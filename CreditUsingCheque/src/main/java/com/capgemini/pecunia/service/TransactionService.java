package com.capgemini.pecunia.service;

import com.capgemini.pecunia.entity.Account;
import com.capgemini.pecunia.entity.ChequeTransactions;

public interface TransactionService {


	String creditUsingCheque(ChequeTransactions debit);
	

	String updateBalance(Account balance) ;


	Account getAccountbyID(String accountID);

}
