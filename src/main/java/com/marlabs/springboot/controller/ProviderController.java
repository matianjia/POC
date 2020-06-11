package com.marlabs.springboot.controller;


import com.marlabs.springboot.entities.Provider;
import com.marlabs.springboot.mapper.ProviderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;


@Controller
public class ProviderController {
    // @RequestMapping(value = "/provides",method = RequestMethod.GET)


    @Autowired
    ProviderMapper providerMapper;

    @GetMapping("/providers")
    public String list(Map<String, Object> map, Provider provider) {
        List<Provider> providers = providerMapper.getProviders(provider);
        map.put("providers", providers);
        map.put("providerName", provider.getProviderName());
        return "provider/list";
    }

    @GetMapping("/provider/{pid}")
    public String view(@PathVariable("pid") Integer pid,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {

        Provider provider = providerMapper.getProviderByPid(pid);
        map.put("provider", provider);
        return "provider/" + type;
    }

    @PutMapping("/provider")
    public String update(Provider provider) {

        providerMapper.updateProvider(provider);

        return "redirect:/providers";
    }

    @GetMapping("/provider")
    public String toAddPage() {

        return "provider/add";
    }

    @PostMapping("/provider")
    public String add(Provider provider) {
        providerMapper.addProvider(provider);
        return "redirect:providers";
    }


    @DeleteMapping("provide/{pid}")
    public String delete(@PathVariable("pid")Integer pid){

        providerMapper.deleteProviderByPid(pid);
        return "redirect:/providers";
    }

}
