package ar.edu.um.programacion2.ejemploprog2.web;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.roo.addon.web.mvc.controller.converter.RooConversionService;
import org.gvnix.addon.geo.annotations.GvNIXGeoConversionService;

/**
 * A central place to register application converters and formatters.
 */
@RooConversionService
@GvNIXGeoConversionService
public class ApplicationConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean {

    @Override
    protected void installFormatters(FormatterRegistry registry) {
        super.installFormatters(registry);
    }
}
