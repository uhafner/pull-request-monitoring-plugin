package io.jenkins.plugins.monitoring;

import java.util.Optional;

/**
 * <p>Defines a single portlet for the pull request monitoring dashboard.</p>
 *
 * <p>The id must be unique. Please make sure that the id is related to the plugin so that
 * there are no conflicts with other plugins. It is recommended to use the artifact id
 * of the plugin or parts of it as prefix. If several portlets of the same class are created in the
 * {@link MonitorPortletFactory}, it must be ensured that {@link #getId()} is always unique for each portlet!</p>
 *
 * @since 1.6.0
 * @author Simon Symhoven
 */
public abstract class MonitorPortlet {

    /**
     * Defines the the to be shown.
     *
     * @return
     *          the title.
     */
    public String getTitle() {
        return "Monitor Portlet";
    }

    /**
     * Defines the id for the portlet.
     *
     * @return
     *          the id.
     */
    public String getId() {
        return this.getClass().getName();
    }

    /**
     * Defines the preferred width of the portlet.
     *
     * @return
     *          the width in pixels.
     */
    public int getPreferredWidth() {
        return 100;
    }

    /**
     * Defines the preferred height of the portlet.
     *
     * @return
     *          the height in pixels.
     */
    public int getPreferredHeight() {
        return 100;
    }

    /**
     * Defines the icon to show in the dropdown list of available portlets.
     *
     * @return
     *          the app relative icon url depending on ${resURL} (/static/cache-id),
     *          or {@code Optional.empty()}, if a default icon should be added.
     */
    public Optional<String> getIconUrl() {
        return Optional.empty();
    }

    /**
     * Defines the relative url to a detail view of the portlet.
     *
     * @return
     *          the relative link to the detail view depending on the current build url
     *          (e.g. http://localhost:8080/jenkins/job/job-name/view/change-requests/job/PR-1/1/),
     *          or {@code Optional.empty()}, if no link should be added to portlet.
     */
    public Optional<String> getDetailViewUrl() {
        return Optional.empty();
    }

}
