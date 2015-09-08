// (C) Copyright 2003-2015 Hewlett-Packard Development Company, L.P.

package com.hp.octane.plugins.jenkins.tests.build;

import hudson.ExtensionList;
import hudson.ExtensionPoint;
import hudson.model.AbstractBuild;
import hudson.model.Hudson;

public abstract class BuildHandlerExtension implements ExtensionPoint {

    public abstract boolean supports(AbstractBuild<?, ?> build);

    // TODO: when sub-job is introduced into the API, this method needs to return both buildType and subJob
    public abstract String getBuildType(AbstractBuild<?, ?> build);

    public abstract String getProjectFullName(AbstractBuild<?, ?> build);

    public static ExtensionList<BuildHandlerExtension> all() {
        return Hudson.getInstance().getExtensionList(BuildHandlerExtension.class);
    }
}
