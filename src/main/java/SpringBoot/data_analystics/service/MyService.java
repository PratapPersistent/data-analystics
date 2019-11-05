package SpringBoot.data_analystics.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import SpringBoot.data_analystics.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import SpringBoot.data_analystics.dto.DocumentDetails;
import SpringBoot.data_analystics.dto.PublicAddress;
import SpringBoot.data_analystics.dto.PublicDetails;
import SpringBoot.data_analystics.dto.WardDetails;
import SpringBoot.data_analystics.entity.PublicDetailsBO;
import SpringBoot.data_analystics.entity.WardDetailsBO;
import SpringBoot.data_analystics.repository.PublicDetailsRepository;
import SpringBoot.data_analystics.repository.UserRepository;
import SpringBoot.data_analystics.repository.WardRepository;

@Service
public class MyService {

	@Autowired
	public WardRepository wardRepository;

	@Autowired
	public PublicDetailsRepository publicDetailsRepository;
	
	@Autowired
	public UserRepository userRepository;

	public List<PublicDetails> getPublicDetails(String wardId) {

		List<PublicDetails> publicDetailsList = new ArrayList<PublicDetails>();

		makeMyList(publicDetailsList);

		return publicDetailsList;
	}

	private void makeMyList(List<PublicDetails> publicDetailsList) {

		List<PublicDetailsBO> publicDetailsBOList = publicDetailsRepository.findAll();

		for (PublicDetailsBO pd : publicDetailsBOList) {
			PublicDetails publicDetails = new PublicDetails();

			BeanUtils.copyProperties(pd, publicDetails);
			publicDetailsList.add(publicDetails);
		}

	}

	public List<WardDetails> getWardDetails(String string) {
		List<WardDetails> wardDetailsList = new ArrayList<WardDetails>();

		makeMyWardList(wardDetailsList);

		return wardDetailsList;
	}

	private void makeMyWardList(List<WardDetails> wardDetailsList) {

		UserDetails userDetails =
				 (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		User user = userRepository.findByUsername(userDetails.getUsername());
		Long wardId = user.getWardDetails().getWardId();
		
		Optional<WardDetailsBO> wardDetailsBo = wardRepository.findById(wardId);
	
			WardDetails wardDetails = new WardDetails();
			BeanUtils.copyProperties(wardDetailsBo.get(), wardDetails);
			wardDetailsList.add(wardDetails);
	//Ward not configured exception need to throw here.

	}

	public PublicDetails getPublicData(Long pdId) {
		
		Optional<PublicDetailsBO> detailsBO = publicDetailsRepository.findById(pdId);
		
		PublicDetails publicDetails = new PublicDetails();

		BeanUtils.copyProperties(detailsBO.get(), publicDetails);
		
		if(publicDetails.getWardId() == null && detailsBO.get().getWardId() != null) {
		publicDetails.setWardId(new WardDetails()); 
		BeanUtils.copyProperties(detailsBO.get().getWardId(), publicDetails.getWardId());
		}
		
	
		
		if(publicDetails.getpAddress() == null && detailsBO.get().getpAddress() != null) {
			publicDetails.setpAddress(new PublicAddress());
			BeanUtils.copyProperties(detailsBO.get().getpAddress(), publicDetails.getpAddress());
		}
		
		if(publicDetails.gettAddress() == null && detailsBO.get().gettAddress() != null) {
			publicDetails.settAddress(new PublicAddress());
			BeanUtils.copyProperties(detailsBO.get().gettAddress(), publicDetails.gettAddress());
		}
		
		if(publicDetails.getDocId() == null && detailsBO.get().getDocId() != null) {
			publicDetails.setDocId(new DocumentDetails());
			BeanUtils.copyProperties(detailsBO.get().getDocId(), publicDetails.getDocId());
		}
		
		return publicDetails;
	}
}
