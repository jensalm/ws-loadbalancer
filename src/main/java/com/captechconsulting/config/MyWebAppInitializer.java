package com.captechconsulting.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
import java.util.Set;

public class MyWebAppInitializer implements WebApplicationInitializer {

    private static final Logger LOG = LoggerFactory.getLogger(MyWebAppInitializer.class);
    private static final String SERVICES_MAPPING = "/services/*";

    @Override
    public void onStartup(ServletContext container) {
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        // Register application config
        rootContext.register(AppConfig.class);

        // Manage the lifecycle of the root application context
        container.addListener(new ContextLoaderListener(rootContext));

        // Register Logging Filter
        addLoggingFilter(container);

        // Register and map the dispatcher servlet
        addServiceDispatcherServlet(container, rootContext);
    }

    private void addServiceDispatcherServlet(ServletContext container, AnnotationConfigWebApplicationContext rootContext) {
        ServletRegistration.Dynamic dispatcher = container.addServlet("spring-ws", new MessageDispatcherServlet(rootContext));
        dispatcher.setLoadOnStartup(1);
        Set<String> mappingConflicts = dispatcher.addMapping(SERVICES_MAPPING);

        if (!mappingConflicts.isEmpty()) {
            for (String s : mappingConflicts) {
                LOG.error("Mapping conflict: " + s);
            }
            throw new IllegalStateException("'spring-ws' could not be mapped to '" + SERVICES_MAPPING + "'");
        }
    }

    private void addLoggingFilter(ServletContext container) {
        FilterRegistration.Dynamic fr = container.addFilter("loggingFilter", new CommonsRequestLoggingFilter());
        fr.addMappingForUrlPatterns(null, true, "/*");
    }

}
