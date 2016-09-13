package fr.imie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Named;

import fr.imie.UserDTO;

@SessionScoped
@Alternative
@Stateful
public class UserServiceSession implements IUserService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7090459650269456625L;
	
	private List<UserDTO> users = new ArrayList<UserDTO>();
	
	@PostConstruct
	private void init(){
		UserDTO userDTO1 = new UserDTO();
		userDTO1.setLogin("admin");
		userDTO1.setPassw("admin");
		users.add(userDTO1);
		UserDTO userDTO2 = new UserDTO();
		userDTO2.setLogin("raymond");
		userDTO2.setPassw("1234");
		users.add(userDTO2);
	}
	
	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}

}
