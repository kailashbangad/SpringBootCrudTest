package in.nit.profile.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.nit.profile.service.GenericService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Profile("default")
public class DevService implements GenericService{
	@Value("${my.profile.code}")
	private String code;

	@Override
	public void executeTask() {
		// TODO Auto-generated method stub
		
	}

}
