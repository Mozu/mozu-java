package com.mozu.api.security;

import com.mozu.api.contracts.customer.CustomerAccount;
import com.mozu.api.contracts.customer.CustomerUserAuthInfo;

public class CustomerAuthenticationProfile {
    private AuthTicket authTicket;
    private CustomerUserAuthInfo customerUserAuthInfo;
    private CustomerAccount customerAccount;
    
    public CustomerAuthenticationProfile () {
        
    }
    
    public CustomerAuthenticationProfile (AuthTicket authTicket,CustomerUserAuthInfo customerUserAuthInfo, CustomerAccount customerAccount) {
        this.authTicket = authTicket;
        this.customerUserAuthInfo = customerUserAuthInfo;
        this.customerAccount = customerAccount;
    }
    
    public AuthTicket getAuthTicket() {
        return authTicket;
    }
    public void setAuthTicket(AuthTicket authTicket) {
        this.authTicket = authTicket;
    }
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public CustomerUserAuthInfo getCustomerUserAuthInfo() {
        return customerUserAuthInfo;
    }

    public void setCustomerUserAuthInfo(CustomerUserAuthInfo customerUserAuthInfo) {
        this.customerUserAuthInfo = customerUserAuthInfo;
    }

    
}
