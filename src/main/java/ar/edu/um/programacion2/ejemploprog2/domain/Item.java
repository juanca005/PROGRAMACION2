package ar.edu.um.programacion2.ejemploprog2.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.json.RooJson;
import ar.edu.um.programacion2.ejemploprog2.web.ItemController;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import javax.persistence.Lob;
import org.springframework.roo.classpath.operations.jsr303.RooUploadedFile;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findItemsByNegocio" })
@RooJson
@RooWebJson(jsonObject = ItemController.class)
public class Item {

    /**
     */
    @NotNull
    @ManyToOne
    private Negocio negocio;

    /**
     */
    @NotNull
    @Size(max = 30)
    private String nombre;

    /**
     */
    private float precio;

    /**
     */
    private Boolean estado;

    /**
     */
    private String descripcion;

    /**
     */
    @RooUploadedFile(contentType = "image/jpeg")
    @Lob
    private byte[] foto;

    /**
     */
    private int orden;
}
