package config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * Created by Amila on 1/12/16.
 */
public class SiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/*","/templates/basic-theme.jsp");
        builder.addDecoratorPath("/","/templates/welcome-template.jsp");
        builder.addDecoratorPath("/login", "/templates/welcome-template.jsp");
        builder.setMimeTypes("text/html", "application/xhtml+xml", "application/vnd.wap.xhtml+xml");
    }
}
