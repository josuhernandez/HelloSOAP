package com.ipartek.formacion.soap;

public class Empleado {

	int id;
	String nombre;
	String apellido;
	int idDepartamento;
	double salario;

	public Empleado() {
		super();
		this.id = 0;
		this.nombre = "";
		this.apellido = "";
		this.idDepartamento = 0;
		this.salario = 0;
	}

	public Empleado(int id, String nombre, String apellido, int idDepartamento, long salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.idDepartamento = idDepartamento;
		this.salario = salario;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the idDepartamento
	 */
	public int getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * @param idDepartamento
	 *            the idDepartamento to set
	 */
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param d
	 *            the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", idDepartamento="
				+ idDepartamento + ", salario=" + salario + "]";
	}

}
