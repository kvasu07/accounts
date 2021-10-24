package com.accounts.assessment.dao.impl;

import com.accounts.assessment.dao.AccountsRepository;
import com.accounts.assessment.model.Account;
import com.accounts.assessment.model.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("accountsRepository")
public class AccountsRepositoryImpl implements AccountsRepository {

    @PersistenceContext
    private EntityManager entitymanager;

    @Override
    public List<Account> getAccounts() {
        return entitymanager.createQuery("from Account", Account.class).getResultList();
    }

    @Override
    public List<Transaction> getTransactions(long accountNumber) {
        return entitymanager.createQuery("from Transaction where accountNumber = :accountNumber", Transaction.class)
                .setParameter("accountNumber", accountNumber).getResultList();
    }
}