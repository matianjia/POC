package com.marlabs.springboot.mapper;

import com.marlabs.springboot.entities.Bill;
import com.marlabs.springboot.entities.BillProvider;
import com.marlabs.springboot.entities.Provider;

import java.util.List;

public interface BillMapper {




  List<BillProvider> getBills(Bill bill);
  BillProvider getBillByBid(Integer bid);
  int addBill(Bill bill);
  int updateBill(Bill bill);
  int deleteBillByBid(Integer bill);

}
