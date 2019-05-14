package com.jk.service.personal;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(value ="SERVICE-PROVIDER")
public interface PersonalSeviceSs extends PersonalService{
}
