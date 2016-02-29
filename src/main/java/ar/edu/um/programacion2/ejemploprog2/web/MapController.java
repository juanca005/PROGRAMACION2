package ar.edu.um.programacion2.ejemploprog2.web;
import org.gvnix.addon.geo.annotations.GvNIXMapViewer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/map")
@GvNIXMapViewer(entityLayers = {  }, projection = "EPSG3857")
public class MapController {
}
