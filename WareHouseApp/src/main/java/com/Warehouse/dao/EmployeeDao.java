package com.Warehouse.dao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.Warehouse.domain.Employee;

@Path("/dao")
public class EmployeeDao {
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/p1")
	public Employee getEmployeeData()
	{
		Employee employee = new Employee(10,"colgate123","MCA","Indore");
		System.out.println("employee dao called test123");
		return employee;
	}
			
	
}
