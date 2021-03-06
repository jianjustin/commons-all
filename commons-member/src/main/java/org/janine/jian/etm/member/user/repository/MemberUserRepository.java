package org.janine.jian.etm.member.user.repository;

import java.io.Serializable;
import org.janine.jian.common.base.BaseMotifyRepository;
import org.janine.jian.etm.member.user.domain.MemberUser;
import org.springframework.stereotype.Repository;

/********************************************
 * 实体操作接口
 * @author janine
 * @since 2017-12-12
 *********************************************/
@Repository
public interface MemberUserRepository extends BaseMotifyRepository<MemberUser, Serializable>{

	
}
