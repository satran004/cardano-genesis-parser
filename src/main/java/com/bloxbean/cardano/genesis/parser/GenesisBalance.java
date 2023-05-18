package com.bloxbean.cardano.genesis.parser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@ToString
public class GenesisBalance {
    private String byronAddress;
    private String txnHash;
    private BigInteger balance;
}
