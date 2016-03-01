package ar.edu.um.programacion2.ejemploprog2.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
<<<<<<< HEAD
import javax.persistence.Transient;
=======


import javax.persistence.Transient;


>>>>>>> 2affdbd028e06842dd4cb5618442062e205bd19a
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
<<<<<<< HEAD
@RooJpaActiveRecord(finders = { "findUsuariosByUsernameEquals" })
public class Usuario {

    @Autowired
    @Transient
    private MessageDigestPasswordEncoder passwordEncoder;

=======
@RooJpaActiveRecord
public class Usuario {

  @Autowired
    @Transient
    private MessageDigestPasswordEncoder passwordEncoder;


>>>>>>> 2affdbd028e06842dd4cb5618442062e205bd19a
    /**
     */
    private String username;

    /**
     */
    private String password;

<<<<<<< HEAD
    public void setPassword(String password) {
=======
public void setPassword(String password) {
>>>>>>> 2affdbd028e06842dd4cb5618442062e205bd19a
        if (password == null || password.equals("")) return; //don't update password if blank is sent
        String encodedPassword = passwordEncoder.encodePassword(password, null);
        this.password = encodedPassword;
    }

<<<<<<< HEAD
    /**
     */
    @ManyToOne
    private Rol id_rol;
=======



>>>>>>> 2affdbd028e06842dd4cb5618442062e205bd19a

    /**
     */
    @ManyToOne
<<<<<<< HEAD
    private Estado id_estado;
=======
    private Rol id_rol;
>>>>>>> 2affdbd028e06842dd4cb5618442062e205bd19a
}
