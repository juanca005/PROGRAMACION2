package ar.edu.um.programacion2.ejemploprog2.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.json.RooJson;
import ar.edu.um.programacion2.ejemploprog2.web.OrdenController;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
@RooWebJson(jsonObject = OrdenController.class)
public class Orden {

    /**
     */
    @NotNull
    @ManyToOne
    private Cliente cliente;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date fecha;

    /**
     */
    @NotNull
    @Size(max = 30)
    private String descripcion;
}
