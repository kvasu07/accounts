package com.accounts.assessment.rest;

import com.accounts.assessment.model.Account;
import com.accounts.assessment.model.Transaction;
import com.accounts.assessment.service.AccountsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(description = "Operations to get accountList and transactionList", position = 1)
public class AccountsController{

    @Autowired
    private AccountsService accountsService;

    @RequestMapping(value = "/accounts",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get list of accounts.")
    public ResponseEntity<List<Account>> getAccounts() {
        final List<Account> accounts = this.accountsService.getAccounts();
        if (accounts.isEmpty()) {
            return new ResponseEntity<List<Account>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
    }

    @RequestMapping(value = "/transactions/{accountNumber}",
            method = RequestMethod.GET,
            produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get list of transactions.")
    public ResponseEntity<List<Transaction>> getTransactions(@ApiParam(value = "The account number", required = true)
                             @PathVariable("accountNumber") Long accountNumber) throws Exception {
        final List<Transaction> transactions = this.accountsService.getTransactions(accountNumber);
        if (transactions.isEmpty()) {
            return new ResponseEntity<List<Transaction>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Transaction>>(transactions, HttpStatus.OK);
    }
}
