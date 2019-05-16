package com.jk.service.advertising;

import com.jk.service.liangh.advertising.AdvertisingServiceApi;
import com.jk.utils.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;



@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface AdvertisingService extends AdvertisingServiceApi {

}
