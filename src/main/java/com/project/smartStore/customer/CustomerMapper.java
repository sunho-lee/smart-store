package com.project.smartStore.customer;

import java.sql.SQLIntegrityConstraintViolationException;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper {

  CustomerDTO selectCustomerDetailById(String id);

  void insertCustomer(CustomerDTO params) throws SQLIntegrityConstraintViolationException;

  void updateCustomerPwd(String id, String updatePwd);

  void updateCustomerName(String id, String updateName);

  void updateCustomerPhoneNum(String id, String updatePhoneNum);

  void deleteCustomerById(String id);
}
