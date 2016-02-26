package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.domain.Orden;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.gvnix.addon.web.mvc.annotations.jquery.GvNIXWebJQuery;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/ordens")
@Controller
@RooWebScaffold(path = "ordens", formBackingObject = Orden.class)
@GvNIXWebJQuery
@RooWebJson(jsonObject = Orden.class)
public class OrdenController {
}
