package io.jenkins.plugins.monitoring;

import hudson.model.Run;

import java.util.Collection;

/**
 * Factory for {@link IMonitorPortlet}.
 *
 * @author Simon Symhoven
 */
interface IMonitorPortletFactory {

    /**
     * Get a collection of {@link MonitorPortlet} to display.
     *
     * @param build
     *              the reference {@link Run}.
     *
     * @return
     *              a collection of {@link MonitorPortlet}.
     */
    Collection<MonitorPortlet> getPortlets(Run<?, ?> build);

    /**
     * Defines the name of the factory.
     *
     * @return
     *              the name to display for the factory.
     */
    String getDisplayName();
}