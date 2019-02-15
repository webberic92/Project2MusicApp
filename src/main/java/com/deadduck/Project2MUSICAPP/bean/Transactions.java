package com.deadduck.Project2MUSICAPP.bean;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "transactions")
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transaction_id;
    private int credit_card_no;
    private int exp_month;
    private int exp_year;
    private int cvv;
    private int user_id;

    public Transactions() {

    }

    public Transactions(int credit_card_no, int exp_month, int exp_year, int cvv, int user_id) {
        this.credit_card_no = credit_card_no;
        this.exp_month = exp_month;
        this.exp_year = exp_year;
        this.cvv = cvv;
        this.user_id = user_id;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getCredit_card_no() {
        return credit_card_no;
    }

    public void setCredit_card_no(int credit_card_no) {
        this.credit_card_no = credit_card_no;
    }

    public int getExp_month() {
        return exp_month;
    }

    public void setExp_month(int exp_month) {
        this.exp_month = exp_month;
    }

    public int getExp_year() {
        return exp_year;
    }

    public void setExp_year(int exp_year) {
        this.exp_year = exp_year;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "transaction_id=" + transaction_id +
                ", credit_card_no=" + credit_card_no +
                ", exp_month=" + exp_month +
                ", exp_year=" + exp_year +
                ", cvv=" + cvv +
                ", user_id=" + user_id +
                '}';
    }
}


