package ad_system.service;

import ad_system.exception.AdException;
import ad_system.vo.CreateUserRequest;
import ad_system.vo.CreateUserResponse;

/**
 * @author ：duqinmei
 */
public interface IUserService {

    /**
     * <h2>create user</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
