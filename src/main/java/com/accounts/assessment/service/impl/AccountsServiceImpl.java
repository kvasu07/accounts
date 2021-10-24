package com.accounts.assessment.service.impl;

import com.accounts.assessment.dao.AccountsRepository;
import com.accounts.assessment.model.Account;
import com.accounts.assessment.model.Transaction;
import com.accounts.assessment.service.AccountsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountsService {

    private static final Logger log = LoggerFactory.getLogger(AccountsServiceImpl.class);

    @Autowired
    private AccountsRepository accountsRepository;

    public List<Transaction> getTransactions(long accountNumber) {
        return accountsRepository.getTransactions(accountNumber);
    }

    public List<Account> getAccounts() {
        return accountsRepository.getAccounts();
    }

}




