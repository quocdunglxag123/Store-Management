package com.quocdung.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.AccountRoleDto;
import com.quocdung.dto.DataResponse;
import com.quocdung.dto.RoleDto;
import com.quocdung.service.impl.RoleServiceImpl;

@RestController
@RequestMapping("/roles")
public class RoleController {
	@Autowired
	private RoleServiceImpl roleImpl;

	@GetMapping()
	@RolesAllowed({"ROLE_ADMIN"})
	public DataResponse getAllRole() {
		return new DataResponse( roleImpl.getAllRole());
	}

	@GetMapping("/{offSet}/{pageSize}")
	@RolesAllowed({"ROLE_ADMIN"})
	public DataResponse getAllRole(@PathVariable int offSet, @PathVariable int pageSize) {
		return new DataResponse( roleImpl.getAllRolePagnation(offSet, pageSize));
	}

	@GetMapping("/{role_id}")
	@RolesAllowed({"ROLE_ADMIN"})
	public DataResponse getCategory(@PathVariable(value = "role_id") Integer role_id) {
		return new DataResponse( roleImpl.getRole(role_id));
	}

	@PostMapping()
	@RolesAllowed({"ROLE_ADMIN"})
	public DataResponse addRole(@RequestBody RoleDto roleDto) {
		return new DataResponse(roleImpl.addRole(roleDto));
	}
	
	@PostMapping("/permission")
	@RolesAllowed({"ROLE_ADMIN"})
	public DataResponse addAccountToRole(@RequestBody AccountRoleDto accountRoleDto) {
		return new DataResponse(roleImpl.addAccountToRole(accountRoleDto));
	}

	@DeleteMapping("/{role_id}")
	@RolesAllowed({"ROLE_ADMIN"})
	public void deleteRole(@PathVariable(value = "role_id") Integer role_id) {
		roleImpl.deleteRole(role_id);
	}

	@PutMapping("/{role_id}")
	@RolesAllowed({"ROLE_ADMIN"})
	public DataResponse updateRole(@PathVariable(value = "role_id") Integer role_id, @RequestBody RoleDto roleDto) {
		return new DataResponse(roleImpl.updateRole(role_id, roleDto));
	}
}
