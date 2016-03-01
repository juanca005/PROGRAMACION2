package ar.edu.um.programacion2.ejemploprog2.model;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Combo {

    /**
     */
    private String nombre;

    /**
     */
    @ManyToOne
    private Producto id_producto;

    /**
     */
    @ManyToOne
    private Estado id_estado;

    /**
     */
    @ManyToOne
    private Comercio id_comercio;

    /**
     */
    private String descripcion;
}
