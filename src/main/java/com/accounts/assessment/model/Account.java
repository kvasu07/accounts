package com.accounts.assessment.model;

import lombok.Data;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    private Long accountNumber;

    @Column
    private String accountName;

    @Column
    private String accountType;

    @Column
    private String currency;

    @Column
    private String balanceDate;

    @Column
    private BigDecimal openAvailableBalance;
}
