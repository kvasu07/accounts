package com.accounts.assessment.model;

import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    //foreign key
    @Column
    private Long accountNumber;

    @Column
    private String accountName;

    @Column
    private String currency;

    @Column
    private String valueDate;

    @Column
    private BigDecimal creditAmount;

    @Column
    private BigDecimal debitAmount;

    @Column
    private String debitCredit;

    @Column
    private String transactionNarrative;
}
