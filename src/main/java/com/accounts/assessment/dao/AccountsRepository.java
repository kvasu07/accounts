package com.accounts.assessment.dao;

import com.accounts.assessment.model.Account;
import com.accounts.assessment.model.Transaction;

import java.util.List;

public interface AccountsRepository {

    List<Transaction> getTransactions(long accountNumber);
    List<Account> getAccounts();
}
