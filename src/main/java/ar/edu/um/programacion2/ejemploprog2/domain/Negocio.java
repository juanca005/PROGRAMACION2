package ar.edu.um.programacion2.ejemploprog2.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.json.RooJson;
import ar.edu.um.programacion2.ejemploprog2.web.NegocioController;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findNegociosByNyaEquals" })
@RooJson
@RooWebJson(jsonObject = NegocioController.class)
public class Negocio {

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "negocio")
    private Set<Item> items = new HashSet<Item>();

    /**
     */
    @NotNull
    @Size(max = 20)
    private String nya;

    /**
     */
    @NotNull
    private String email;

    /**
     */
    private int telefono;

    /**
     */
    @NotNull
    @Size(max = 30)
    private String domicilio;
}
