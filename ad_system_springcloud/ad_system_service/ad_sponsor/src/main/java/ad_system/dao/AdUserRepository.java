package ad_system.dao;

import ad_system.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ：duqinmei
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * <h2>finding user records by username</h2>
     * */
    AdUser findByUsername(String username);
}
