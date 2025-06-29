package com.makon.accounts.service;

import com.makon.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     * t
     * @param customerDto - CustomerDto Object
     */

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
