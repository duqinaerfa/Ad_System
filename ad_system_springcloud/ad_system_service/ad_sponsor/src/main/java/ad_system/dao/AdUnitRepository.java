package ad_system.dao;

import ad_system.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @author ：duqinmei
 */

public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
