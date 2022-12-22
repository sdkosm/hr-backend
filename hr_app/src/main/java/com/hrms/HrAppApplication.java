package com.hrms;

import com.hrms.model.Role_master;
import com.hrms.repository.Employee_infoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import javax.mail.MessagingException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HrAppApplication {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private Employee_infoRepo userDetailsRepository;

	@Autowired
	private EmailSenderService emailSenderService;

	//Main method to run application
	public static void main(String[] args) {
		SpringApplication.run(HrAppApplication.class, args);
		System.out.println("Server has been Started - Port no : 9001!!");
	}


	//put raw data in database by main file ( Just for testing purpose )

	//put raw data in database by main file


	@PostConstruct
	protected void init() {

		//which type of authority we want

		List<Role_master> authorityList=new ArrayList<>();

		//this is Role, either it is User or Admin

//		authorityList.add(createAuthority("USER","User role"));
		authorityList.add(createAuthority("ADMIN","Admin role"));

		//Demo data which, we want to put in database for login


//		User user=new User();
//		user.setUserName("NXT92");
//		user.setFirstName("Deepak");
//		user.setLastName("Lodha");
//		user.setEmail("deepaklodha067@gmail.com");
//		user.setPhoneNumber("8518068366");
////		user.setCreatedAt(2022-11-15 11:40:52);
//		user.setCreatedBy("Somil");
//		user.setPassword(passwordEncoder.encode("sdkosm@123"));
//		user.setAuthorities(authorityList);
//		userDetailsRepository.save(user);

	}

//	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail() throws MessagingException {
		emailSenderService.sendMailWithAttachment("deepaklodha067@gmail.com","sdkosm23@gmail.com","dshlearn@gmail.com", "Nexturn provides branding, advertising, animation, UX design, social media management, web development, and digital marketing."
				+ "and I have added the bcc and cc option in offer letter" + "Thank You !!", "Nexturn Deepak_Lodha Dummy Offer Letter", "D:\\DOWNLOAD\\DEEPAK LODHA (1).pdf");
	}

	private Role_master createAuthority(String roleCode, String roleDescription) {
		Role_master authority=new Role_master();
		authority.setRoleCode(roleCode);
		authority.setRoleDescription(roleDescription);
		return authority;
	}

}
