// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ar.edu.um.programacion2.ejemploprog2.domain;

import ar.edu.um.programacion2.ejemploprog2.domain.Item;
import ar.edu.um.programacion2.ejemploprog2.domain.Negocio;
import java.util.Set;

privileged aspect Negocio_Roo_JavaBean {
    
    public Set<Item> Negocio.getItems() {
        return this.items;
    }
    
    public void Negocio.setItems(Set<Item> items) {
        this.items = items;
    }
    
    public String Negocio.getNya() {
        return this.nya;
    }
    
    public void Negocio.setNya(String nya) {
        this.nya = nya;
    }
    
    public String Negocio.getEmail() {
        return this.email;
    }
    
    public void Negocio.setEmail(String email) {
        this.email = email;
    }
    
    public int Negocio.getTelefono() {
        return this.telefono;
    }
    
    public void Negocio.setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String Negocio.getDomicilio() {
        return this.domicilio;
    }
    
    public void Negocio.setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
}
