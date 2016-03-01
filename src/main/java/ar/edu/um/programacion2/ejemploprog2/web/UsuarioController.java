package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.model.Usuario;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
=======
>>>>>>> 2affdbd028e06842dd4cb5618442062e205bd19a

@RequestMapping("/usuarios")
@Controller
@RooWebScaffold(path = "usuarios", formBackingObject = Usuario.class)
<<<<<<< HEAD
@RooWebFinder
=======
>>>>>>> 2affdbd028e06842dd4cb5618442062e205bd19a
public class UsuarioController {
}
