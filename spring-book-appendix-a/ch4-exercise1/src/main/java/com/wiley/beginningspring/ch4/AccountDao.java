package com.wiley.beginningspring.ch4;

import java.util.List;

public interface AccountDao {
    public void insert(Account account);
    public void update(Account account);
    public void update(List<Account> accounts);
    public void delete(long accountId);
    public Account find(long accountId);
    public List<Account> find(List<Long> accountIds);
    public List<Account> find(String ownerName);
    public List<Account> find(boolean locked);
    public List<Account> findByOwnerAndLocked(String ownerName, boolean locked);
}

