package com.jk.service.notice;

import com.jk.service.liangh.notice.RecritServiceapi;
import com.jk.utils.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Administrator
 */
@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface RecritService extends RecritServiceapi {
}
