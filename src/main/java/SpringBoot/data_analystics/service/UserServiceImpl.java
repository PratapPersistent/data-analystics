package SpringBoot.data_analystics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import SpringBoot.data_analystics.entity.User;
import SpringBoot.data_analystics.entity.WardDetailsBO;
import SpringBoot.data_analystics.repository.RoleRepository;
import SpringBoot.data_analystics.repository.UserRepository;
import SpringBoot.data_analystics.repository.WardRepository;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private WardRepository wardRepository;
	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(new HashSet<>(roleRepository.findAll()));
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public void saveWard(WardDetailsBO wardDetailsBO) {
		wardRepository.save(wardDetailsBO);
		
	}
}