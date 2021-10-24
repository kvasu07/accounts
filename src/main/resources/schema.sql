DROP TABLE IF EXISTS accounts;
DROP TABLE IF EXISTS transactions;

create table accounts (
  accountNumber bigint(30) primary key,
  accountName varchar(60),
  accountType varchar(30),
  currency varchar(5),
  balanceDate varchar(20),
  openAvailableBalance numeric(10,4)
);


create table transactions (
  id integer AUTO_INCREMENT primary key,
  accountNumber bigint(30),
  accountName varchar(60),
  currency varchar(5),
  valueDate varchar(20),
  creditAmount numeric(6,2),
  debitAmount numeric(6,2),
  debitCredit varchar(20),
  transactionNarrative varchar(255),
  FOREIGN KEY (accountNumber) REFERENCES accounts(accountNumber)
);
