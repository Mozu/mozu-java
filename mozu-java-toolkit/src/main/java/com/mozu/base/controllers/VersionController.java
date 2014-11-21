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

import com.mozu.base.models.AppInfo;
import com.mozu.base.utils.ApplicationUtils;

@Controller
@RequestMapping("/version")
public class VersionController implements ServletContextAware {

    private ServletContext context;
    
    @Override
    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody AppInfo getversion(final HttpServletRequest request ) throws Exception {
        InputStream manifestStream = context.getResourceAsStream("/META-INF/MANIFEST.MF");
        AppInfo appInfo = ApplicationUtils.getAppInfo();
        if (manifestStream== null) {
            appInfo.setBuildVersion("Unknown version");
        } else {
	        Manifest manifest = new Manifest(manifestStream);
	        Attributes attributes = manifest.getMainAttributes();
	        appInfo.setBuildVersion(attributes.getValue("Implementation-Version"));
        }
        return appInfo;
    }
    
    
}
