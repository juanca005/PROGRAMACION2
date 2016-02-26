package ar.edu.um.programacion2.ejemploprog2.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.json.RooJson;
import ar.edu.um.programacion2.ejemploprog2.web.ClienteController;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
@RooWebJson(jsonObject = ClienteController.class)
public class Cliente {

    /**
     */
    @NotNull
    @Size(max = 20)
    private String nya;

    /**
     */
    @NotNull
    @Size(max = 30)
    private String email;

    /**
     */
    private int telefono;

    /**
     */
    @NotNull
    @Size(max = 30)
    private String domicilio;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Set<Orden> ordenes = new HashSet<Orden>();
}
