package com.rajan.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rajan.bean.Account;

/*
 * It is just a helper class which should be replaced by database implementation.
 * It is not very well written class, it is just used for demonstration.
 */
public class AccountService {
	
	static Logger LOGGER = LoggerFactory.getLogger(AccountService.class);

 static HashMap<Integer,Account> accountIdMap=getAccountIdMap();


 public AccountService() {
  super();

  if(accountIdMap==null)
  {
   accountIdMap=new HashMap<Integer,Account>();
  // Creating some objects of Account while initializing
   Account rajanAccount=new Account(1, "Rajan", "Krishnan", 10001);
   Account mylAccount=new Account(4, "Myl", "Ram", 10002);
   Account muthuAccount=new Account(3, "Muthu", "Sri", 10003);
   Account samyAccount=new Account(2, "Samy", "Govind", 10004);


   accountIdMap.put(1,rajanAccount);
   accountIdMap.put(4,mylAccount);
   accountIdMap.put(3,muthuAccount);
   accountIdMap.put(2,samyAccount);
  }
 }

 public List<Account> getAllAccounts()
 {
  List<Account> accounts = new ArrayList<Account>(accountIdMap.values());
  return accounts;
 }

 public Account getAccount(int id)
 {
  Account account= accountIdMap.get(id);
  return account;
 }
 public Account addAccount(Account account)
 {
  account.setId(getMaxId()+1);
  accountIdMap.put(account.getId(), account);
  return account;
 }
 
 public Account updateAccount(Account account)
 {
  if(account.getId()<=0)
   return null;
  accountIdMap.put(account.getId(), account);
  LOGGER.info("Account updated");
  return account;

 }
 public void deleteAccount(int id)
 {
  accountIdMap.remove(id);
  LOGGER.info("Account deleted id = " + id);
 }

 public static HashMap<Integer, Account> getAccountIdMap() {
  return accountIdMap;
 }
 

 // Utility method to get max id
 public static int getMaxId()
 {   int max=0;
 for (int id:accountIdMap.keySet()) {  
  if(max<=id)
   max=id;

 }  
 return max;
 }
}

