package com.accounts.assessment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account implements Serializable {

    @Id
    @Column(name = "accountNumber")
    private Long accountNumber;

    @Column(name = "accountName")
    private String accountName;

    @Column(name = "accountType")
    private String accountType;

    @Column(name = "currency")
    private String currency;

    @Column(name = "balanceDate")
    private String balanceDate;

    @Column(name = "openAvailableBalance")
    private BigDecimal openAvailableBalance;
    
}
