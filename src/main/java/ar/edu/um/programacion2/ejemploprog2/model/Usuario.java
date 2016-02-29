package ar.edu.um.programacion2.ejemploprog2.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import javax.persistence.Transient;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findUsuariosByUsernameEquals" })
public class Usuario {

    @Autowired
    @Transient
    private MessageDigestPasswordEncoder passwordEncoder;

    /**
     */
    private String username;

    /**
     */
    private String password;

    public void setPassword(String password) {
        if (password == null || password.equals("")) return; //don't update password if blank is sent
        String encodedPassword = passwordEncoder.encodePassword(password, null);
        this.password = encodedPassword;
    }

    /**
     */
    @ManyToOne
    private Rol id_rol;

    /**
     */
    @ManyToOne
    private Estado id_estado;
}
