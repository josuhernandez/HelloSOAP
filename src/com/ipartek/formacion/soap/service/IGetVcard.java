package com.ipartek.formacion.soap.service;

import com.ipartek.formacion.soap.Empleado;

public interface IGetVcard {

	public Empleado getVcard(String usuario, String password, int id_empleado);

}
