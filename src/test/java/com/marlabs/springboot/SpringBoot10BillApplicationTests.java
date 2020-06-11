package com.marlabs.springboot;

import com.marlabs.springboot.entities.Bill;
import com.marlabs.springboot.entities.BillProvider;
import com.marlabs.springboot.entities.Provider;
import com.marlabs.springboot.mapper.BillMapper;
import com.marlabs.springboot.mapper.ProviderMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot10BillApplicationTests {

    @Autowired
    ProviderMapper providerMapper;

    @Test
    void contextLoads() {

//        Provider p=new Provider();
//        p.setProviderName("A货");
//        providerMapper.getProviders(p);
//        List<Provider> providers=providerMapper.getProviders(p);
//        System.out.println(providers.get(0));

        Provider provider = providerMapper.getProviderByPid(2);
        System.out.println(provider);
    }

    @Autowired
    BillMapper billMapper;

    @Test
    public void testBill() {
        Bill b = new Bill();
//

        billMapper.getBillByBid(3);

    }

}
