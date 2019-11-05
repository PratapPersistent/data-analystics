package SpringBoot.data_analystics.service;

import SpringBoot.data_analystics.entity.User;
import SpringBoot.data_analystics.entity.WardDetailsBO;

public interface UserService {
    void save(User user);
    void saveWard(WardDetailsBO wardDetailsBO);

    User findByUsername(String username);
}