package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.model.Producto;
import ar.edu.um.programacion2.ejemploprog2.model.Usuario;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import antlr.collections.List;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;

@RequestMapping("/productoes")
@Controller
@RooWebScaffold(path = "productoes", formBackingObject = Producto.class)
@RooWebFinder
public class ProductoController {
}
