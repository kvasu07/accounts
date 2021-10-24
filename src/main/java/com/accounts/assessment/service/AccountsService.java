package com.accounts.assessment.service;

import com.accounts.assessment.model.Account;
import com.accounts.assessment.model.Transaction;
import java.util.List;

public interface AccountsService {

    List<Account> getAccounts();
    List<Transaction> getTransactions(long accountNumber);
}
