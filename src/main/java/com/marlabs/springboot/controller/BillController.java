package com.marlabs.springboot.controller;

import com.marlabs.springboot.entities.Bill;
import com.marlabs.springboot.entities.BillProvider;
import com.marlabs.springboot.entities.Provider;
import com.marlabs.springboot.mapper.BillMapper;
import com.marlabs.springboot.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class BillController {
    @Autowired
    BillMapper billMapper;
    @Autowired
    ProviderMapper providerMapper;

    @GetMapping("/bills")
    public String list(Map<String, Object> map, Bill bill) {

//get all providers，
        List<Provider> providers = providerMapper.getProviders(null);
        List<BillProvider> billProviders = billMapper.getBills(bill);
//query bill
        //Collection<BillProvider> billProviders = billMapper.getBills(bp);
        map.put("providers", providers);
        map.put("billName", bill.getBillName());
        map.put("pid", bill.getPid());
        map.put("pay", bill.getPay());
        map.put("billProviders", billProviders);

        return "bill/list";
    }

    @GetMapping("/bill/{bid}")
    public String view(@PathVariable("bid") Integer bid,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {

        BillProvider billProvider = billMapper.getBillByBid(bid);
        map.put("billProvider", billProvider);
////show all providers
        if ("update".equals(type)) {
            map.put("providers", providerMapper.getProviders(null));
        }
//// type = null link to view.html， type=update link to update.html
        return "bill/" + type;
    }

    //
//
    @PutMapping("/bill")
    public String update(Bill bill) {

        billMapper.updateBill(bill);
        return "redirect:bills";
    }

    //
    @GetMapping("/bill")
    public String toAddPage(Map<String, Object> map) {
        map.put("providers", providerMapper.getProviders(null));
        return "bill/add";
    }


    @PostMapping("/bill")
    public String add(Bill bill) {
        billMapper.addBill(bill);
        return "redirect:/bills";
   }

    @DeleteMapping("/bill/{bid}")
    public  String delete(@PathVariable("bid")Integer bid){

        billMapper.deleteBillByBid(bid);
        return "redirect:/bills";
    }


    }

