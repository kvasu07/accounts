INSERT INTO accounts (accountNumber, accountName, accountType, currency, balanceDate, openAvailableBalance) VALUES
  (585309209, 'SGDSavings756', 'Savings', 'SGD', '08/11/2018',84327.51);
INSERT INTO accounts (accountNumber, accountName, accountType, currency, balanceDate, openAvailableBalance) VALUES
  (791066619, 'AUSavings933', 'Savings', 'AUD', '08/11/2018',88005.93);

INSERT INTO transactions (accountNumber, accountName, currency, valueDate, debitAmount, creditAmount, debitCredit, transactionNarrative) VALUES
  (585309209, 'Savings Account', 'SGD', 'Jan 12,2012',null ,9540.98, 'Credit','Salary Credit');
INSERT INTO transactions (accountNumber, accountName, currency, valueDate, debitAmount, creditAmount, debitCredit, transactionNarrative) VALUES
  (585309209, 'Savings Account', 'SGD', 'Jan 12,2012',603.45, null, 'Debit','Rent Deduction');

