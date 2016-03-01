package ar.edu.um.programacion2.ejemploprog2.model;
import org.gvnix.addon.jpa.annotations.query.GvNIXJpaQuery;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findProductoesByUsuario" })
public class Producto {

    /**
     */
    private String nombre;

    private float precio;

    /**
     */
    @ManyToOne
    private Comercio usuario;

    @GvNIXJpaQuery(filterBy = { "nombre", "direccion" }, orderBy = { "nombre", "direccion" })
    @ManyToOne
    private Comercio comercio;

    /**
     */
    private String descripcion;

    /**
     */
    @ManyToOne
    private Estado id_estado;
}
