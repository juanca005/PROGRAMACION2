// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ar.edu.um.programacion2.ejemploprog2.model;

import ar.edu.um.programacion2.ejemploprog2.model.Combo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Combo_Roo_Jpa_Entity {
    
    declare @type: Combo: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Combo.id;
    
    @Version
    @Column(name = "version")
    private Integer Combo.version;
    
    public Long Combo.getId() {
        return this.id;
    }
    
    public void Combo.setId(Long id) {
        this.id = id;
    }
    
    public Integer Combo.getVersion() {
        return this.version;
    }
    
    public void Combo.setVersion(Integer version) {
        this.version = version;
    }
    
}
