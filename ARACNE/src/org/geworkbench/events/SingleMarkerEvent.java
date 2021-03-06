package org.geworkbench.events;

import org.geworkbench.bison.datastructure.bioobjects.markers.DSGeneMarker;
import org.geworkbench.engine.config.events.Event;

/**
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: First Genetic Trust Inc.</p>
 *
 * @author First Genetic Trust
 * @version 1.0
 */
public class SingleMarkerEvent extends Event {
    public SingleMarkerEvent(DSGeneMarker mInfo, String message) {
        super(null);
        marker = mInfo;
        value = message;
    }

    public DSGeneMarker getMarker() {
        return marker;
    }

    public String getMessage() {
        return value;
    }

    private DSGeneMarker marker = null;
    private String value = null;
}
