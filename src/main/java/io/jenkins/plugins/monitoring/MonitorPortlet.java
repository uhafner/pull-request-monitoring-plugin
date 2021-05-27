package io.jenkins.plugins.monitoring;

import java.util.Optional;

/**
 * <p>Implements the {@link IMonitorPortlet} interface and defines a single portlet for the pull request monitoring
 * dashboard.</p>
 *
 * <p>The id must be unique. Please make sure that the id is related to the plugin so that
 * there are no conflicts with other plugins. It is recommended to use the artifact id
 * of the plugin or parts of it as prefix. If several portlets of the same class are created in the
 * {@link MonitorPortletFactory}, it must be ensured that {@link #getId()} is always unique for each portlet!</p>
 *
 * @see io.jenkins.plugins.monitoring.IMonitorPortlet
 * @since 1.6.0
 * @author Simon Symhoven
 */
public abstract class MonitorPortlet implements IMonitorPortlet {

    @Override
    public String getTitle() {
        return "Monitor Portlet";
    }

    @Override
    public String getId() {
        return "monitor-portlet";
    }

    @Override
    public int getPreferredWidth() {
        return 100;
    }

    @Override
    public int getPreferredHeight() {
        return 100;
    }

    @Override
    public Optional<String> getIconUrl() {
        return Optional.empty();
    }

    @Override
    public Optional<String> getDetailViewUrl() {
        return Optional.empty();
    }

}
