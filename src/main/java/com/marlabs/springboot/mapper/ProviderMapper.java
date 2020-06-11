package com.marlabs.springboot.mapper;

import com.marlabs.springboot.entities.Provider;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

public interface ProviderMapper {




    List<Provider> getProviders(Provider provider);
    Provider getProviderByPid(Integer pid);
    int addProvider(Provider provider);
    int deleteProviderByPid(Integer pid);
    int updateProvider(Provider provider);



}
