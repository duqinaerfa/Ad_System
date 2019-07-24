package ad_system.service;

import ad_system.vo.CreativeRequest;
import ad_system.vo.CreativeResponse;

/**
 * @author ：duqinmei
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
