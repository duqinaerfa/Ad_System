package ad_system.service;

import ad_system.entity.AdPlan;
import ad_system.exception.AdException;
import ad_system.vo.AdPlanGetRequest;
import ad_system.vo.AdPlanRequest;
import ad_system.vo.AdPlanResponse;

import java.util.List;

/**
 * @author ：duqinmei
 */
public interface IAdPlanService {

    /**
     * <h2>create ad plan</h2>
     * */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>get ad plan</h2>
     * */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>update ad plan</h2>
     * */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>delete ad plan</h2>
     * */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}

