package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.model.Usuario;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/usuarios")
@Controller
@RooWebScaffold(path = "usuarios", formBackingObject = Usuario.class)
@RooWebFinder
public class UsuarioController {
}
