package io.jenkins.plugins.monitoring;

import hudson.ExtensionPoint;
import hudson.model.Run;

import java.util.Collection;
import java.util.Collections;

/**
 * <p>Implements the {@link IMonitorPortletFactory} interface and defines the {@link ExtensionPoint} to register a
 * new pull request monitoring portlet.</p>
 *
 * <p>The {@link #getDisplayName()} is shown in a dropdown list as optgroup. The children of the optgroup
 * are the registered portlets of {@link #getPortlets(Run)}. </p>
 *
 * <p>Since an empty dashboard is always added by default, it is possible that the method {@link #getPortlets(Run)} will
 * be called even though the current run may not be finished. It is therefore advisable to perform a null check on
 * the actions of the run required by your portlet and return an empty list if necessary.
 * (Example: <a href="https://github.com/simonsymhoven/code-coverage-api-plugin/blob/pull-request-monitoring-portlet/
 * src/main/java/io/jenkins/plugins/coverage/CoveragePullRequestMonitoringPortlet.java#L142">code-coverage-api</a>)</p>
 *
 * @see io.jenkins.plugins.monitoring.IMonitorPortletFactory
 * @since 1.6.0
 * @author Simon Symhoven
 */
public abstract class MonitorPortletFactory implements ExtensionPoint, IMonitorPortletFactory {

    @Override
    public Collection<MonitorPortlet> getPortlets(Run<?, ?> build) {
        return Collections.emptyList();
    }


    @Override
    public String getDisplayName() {
        return "Monitor Portlet Factory";
    }

}
