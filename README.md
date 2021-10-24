Get Accounts and Transactions List

A sample spring boot application with H2 db integration.

Commands

./gradlew clean

./gradlew build

./gradlew bootRun

H2 DB Console - http://localhost:8181/h2-console/

Endpoints

1.Get Accounts (To check from postman)

http://localhost:8181/user/accounts

2.Get Transactions for the account (To check from postman)

http://localhost:8181/user/transactions/{accountNumber}
