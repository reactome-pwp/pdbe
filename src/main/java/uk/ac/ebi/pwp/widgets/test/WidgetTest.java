package uk.ac.ebi.pwp.widgets.test;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import uk.ac.ebi.pwp.widgets.pdb.ui.PDBViewer;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WidgetTest implements EntryPoint {
    // IMPORTANT! ATTENTION!
    // Do NOT use the "module rename-to" for the place holder ( but it is case sensitive :D )
    private static final String PLACE_HOLDER = "widget_test";

    @Override
    public void onModuleLoad() {
        GWT.runAsync(new RunAsyncCallback() {
            public void onFailure(Throwable caught) {
            }

            public void onSuccess() {
                RootPanel.get(PLACE_HOLDER).add(new PDBViewer("P35568", "UniProt:P35568 IRS1"));    //Contains results
//                RootPanel.get(PLACE_HOLDER).add(new PDBViewer("Q8IZJ1", "UniProt:Q8IZJ1")); //Does NOT contain results
            }
        });
    }
}
