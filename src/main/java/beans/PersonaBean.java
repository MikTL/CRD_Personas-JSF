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
	private static List<Persona> lstPersona= new ArrayList<Persona>();

	public void agregarPersona() {
		PersonaBean.lstPersona.add(this.persona); 
	}
	
	public void eliminarPersona(Persona persona) {
		PersonaBean.lstPersona.remove(persona);
	}
	public Persona getPersona() {
		return persona;
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
