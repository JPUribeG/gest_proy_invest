package com.example.gest_proy_invest.Exception;

public class UsernameOrIdNotFound extends Exception {

	private static final long serialVersionUID = -7303090899191849791L;

	public UsernameOrIdNotFound() {
		super("Usuario o Id no encontrado");
	}
	
	public UsernameOrIdNotFound(String message) {
		super(message);
	}
}