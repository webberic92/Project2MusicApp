package com.deadduck.Project2MUSICAPP.repository;

import com.deadduck.Project2MUSICAPP.bean.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transactions, Integer> {

}
