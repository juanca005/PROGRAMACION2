// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ar.edu.um.programacion2.ejemploprog2.domain;

import ar.edu.um.programacion2.ejemploprog2.domain.Item;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Item_Roo_Jpa_Entity {
    
    declare @type: Item: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Item.id;
    
    @Version
    @Column(name = "version")
    private Integer Item.version;
    
    public Long Item.getId() {
        return this.id;
    }
    
    public void Item.setId(Long id) {
        this.id = id;
    }
    
    public Integer Item.getVersion() {
        return this.version;
    }
    
    public void Item.setVersion(Integer version) {
        this.version = version;
    }
    
}
