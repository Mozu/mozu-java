package com.mozu.base.controllers;

import java.io.InputStream;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;

@Controller
@RequestMapping("/version")
public class VersionController implements ServletContextAware {

    private ServletContext context;
    
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String getversion(final HttpServletRequest request ) throws Exception {
        InputStream manifestStream = context.getResourceAsStream("/META-INF/MANIFEST.MF");
        if (manifestStream== null) {
            return "Unknown version";
        }
        Manifest manifest = new Manifest(manifestStream);
        Attributes attributes = manifest.getMainAttributes();
        return attributes.getValue("Implementation-Version");
    }
}
