package com.jk.service.explain;

import com.jk.service.liangh.explain.ExplainServiceApi;
import com.jk.utils.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface ExplainService extends ExplainServiceApi {


}
