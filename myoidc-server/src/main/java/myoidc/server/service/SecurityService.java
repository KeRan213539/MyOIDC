package myoidc.server.service;

import myoidc.server.service.dto.UserJsonDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 2018/2/5
 *
 * @author Shengzhao Li
 */
public interface SecurityService extends UserDetailsService {

    UserJsonDto loadCurrentUserJsonDto();

}
