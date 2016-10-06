package com.ipartek.formacion.soap.service;

import com.ipartek.formacion.soap.Empleado;

public class VcardService implements IGetVcard {
	Empleado empleado;

	public VcardService() {
		super();
		this.empleado = new Empleado();
	}

	@Override
	public Empleado getVcard(String usuario, String password, int id_empleado) {

		if ("admin".equalsIgnoreCase(usuario) && "admin".equalsIgnoreCase(password)) {
			empleado.setId(1);
			empleado.setNombre("Ander");
			empleado.setApellido("Uraga Real");
			empleado.setIdDepartamento(12);
			empleado.setSalario(100.000);
		}
		return empleado;

	}

}
