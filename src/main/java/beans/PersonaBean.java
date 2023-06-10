package beans;

import java.util.ArrayList;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import clases.Persona;

@ManagedBean
@RequestScoped
public class PersonaBean {
	public PersonaBean() {}
	private Persona persona = new Persona();
	private Persona persona2=new Persona();
	
	private static List<Persona> lstPersona= new ArrayList<Persona>();

	public void agregarPersona() {
		this.persona.setNombre(persona2.getNombre());
		this.persona.setApellido(persona2.getApellido());
		this.persona.setSexo(persona2.getSexo());
		PersonaBean.lstPersona.add(this.persona); 
		resetForm();
		
	}
	
	public void eliminarPersona(Persona persona) {
		PersonaBean.lstPersona.remove(persona);
	}
	public Persona getPersona() {
		return persona;
	}
	
	public void resetForm() {
		this.persona2.setNombre("");
		this.persona2.setApellido("");
		this.persona2.setSexo("");
		
	}
	

	public Persona getPersona2() {
		return persona2;
	}

	public void setPersona2(Persona persona2) {
		this.persona2 = persona2;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public List<Persona> getLstPersona() {
		return lstPersona;
	}
	public void setLstPersona(List<Persona> lstPersona) {
		PersonaBean.lstPersona = lstPersona;
	}
	
}
