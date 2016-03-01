package ar.edu.um.programacion2.ejemploprog2.web;
import ar.edu.um.programacion2.ejemploprog2.model.Comercio;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.finder.RooWebFinder;
import org.gvnix.web.report.roo.addon.annotations.GvNIXReports;

@RequestMapping("/comercios")
@Controller
@RooWebScaffold(path = "comercios", formBackingObject = Comercio.class)
@RooWebFinder
@GvNIXReports({ "report_ventas|pdf" })
public class ComercioController {
}
