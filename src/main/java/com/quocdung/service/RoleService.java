package com.quocdung.service;


import com.quocdung.dto.AccountRoleDto;
import com.quocdung.dto.RoleDto;

public interface RoleService {
	Object getAllRole();

	Object getAllRolePagnation(int offSet, int pageSize);

	Object getRole(Integer id);

	Object addRole(RoleDto roleDto);

	void deleteRole(Integer id);

	Object updateRole(Integer id, RoleDto roleDto);
	Object addAccountToRole(AccountRoleDto accountRoleDto);
}
