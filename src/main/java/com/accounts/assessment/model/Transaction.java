package com.accounts.assessment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    //foreign key
    @Column(name = "accountNumber")
    private Long accountNumber;

    @Column(name = "accountName")
    private String accountName;

    @Column(name = "currency")
    private String currency;

    @Column(name = "valueDate")
    private String valueDate;

    @Column(name = "creditAmount")
    private BigDecimal creditAmount;

    @Column(name = "debitAmount")
    private BigDecimal debitAmount;

    @Column(name = "debitCredit")
    private String debitCredit;

    @Column(name = "transactionNarrative")
    private String transactionNarrative;

}
