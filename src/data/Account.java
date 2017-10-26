/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Julián
 */
public class Account {
    private int id;
    private double credit;
    private Client[] owner;

    public Account(int id, double credit) {
        this.id = id;
        this.credit = credit;
        this.owner = new Client [1];
    }

    public int getId() {
        return id;
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", credit=" + credit + '}' + super.toString();
    }
    
    
}
