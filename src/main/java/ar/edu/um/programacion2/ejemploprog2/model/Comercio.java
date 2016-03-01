package ar.edu.um.programacion2.ejemploprog2.model;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import com.vividsolutions.jts.geom.Point;
import org.hibernate.annotations.Type;
import org.gvnix.addon.jpa.annotations.geo.GvNIXEntityMapLayer;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@GvNIXEntityMapLayer
public class Comercio {

    /**
     */
    private String nombre;

    /**
     */
    private String direccion;

    /**
     */
    @ManyToOne
    private Usuario usuario;

    private int telefono;

    private String correo;

    private String contacto;

    /**
     */
    @ManyToOne
    private Tags id_tags;

    @Type(type = "org.hibernate.spatial.GeometryType")
    private Point location;
}
