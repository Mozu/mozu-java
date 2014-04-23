package com.mozu.api;

import java.util.List;

import com.mozu.api.contracts.adminuser.DeveloperAccount;

public class MultipleAccountsException extends Exception {
    private static final long serialVersionUID = 1L;

    protected List<DeveloperAccount> accounts;

    public MultipleAccountsException(List<DeveloperAccount> accounts){
           this.accounts = accounts;
    }
    
    public List<DeveloperAccount> getAccounts() {
           return accounts;
    }

    public void setAccounts(List<DeveloperAccount> accounts) {
           this.accounts = accounts;
    }
}
