package com.jk.service.field;

import com.jk.service.liangh.field.FieldServiceApi;
import com.jk.utils.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface FieldService extends FieldServiceApi {
}
