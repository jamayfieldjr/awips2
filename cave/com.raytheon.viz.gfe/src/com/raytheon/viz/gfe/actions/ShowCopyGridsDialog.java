/**
 * This software was developed and / or modified by Raytheon Company,
 * pursuant to Contract DG133W-05-CQ-1067 with the US Government.
 * 
 * U.S. EXPORT CONTROLLED TECHNICAL DATA
 * This software product contains export-restricted data whose
 * export/transfer/disclosure is restricted by U.S. law. Dissemination
 * to non-U.S. persons whether in the United States or abroad requires
 * an export license or other authorization.
 * 
 * Contractor Name:        Raytheon Company
 * Contractor Address:     6825 Pine Street, Suite 340
 *                         Mail Stop B8
 *                         Omaha, NE 68106
 *                         402.291.0100
 * 
 * See the AWIPS II Master Rights File ("Master Rights File.pdf") for
 * further licensing information.
 **/
package com.raytheon.viz.gfe.actions;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.swt.widgets.Shell;

import com.raytheon.viz.gfe.core.DataManager;
import com.raytheon.viz.gfe.dialogs.CopyGridsDialog;
import com.raytheon.viz.ui.dialogs.CaveJFACEDialog;

/**
 * Action for launching CopyGrids dialog.
 * 
 * <pre>
 * SOFTWARE HISTORY
 * Date         Ticket#    Engineer    Description
 * ------------ ---------- ----------- --------------------------
 * Feb 27, 2008            Eric Babin  Initial Creation
 * Oct 23, 2012 1287       rferrel     Changes for non-blocking CopyGridsDialog.
 * Aug 27, 2015 4749       njensen     Now extends GfeShowDialogHandler
 * 
 * </pre>
 */
public class ShowCopyGridsDialog extends GfeShowDialogHandler {

    @Override
    protected CaveJFACEDialog createDialog(Shell shell, DataManager dm,
            ExecutionEvent event) {
        boolean isSelected;
        String selectedOrAll = event.getParameter("selectedOrAll");
        if ("selected".equalsIgnoreCase(selectedOrAll)) {
            isSelected = true;
        } else if ("all".equalsIgnoreCase(selectedOrAll)) {
            isSelected = false;
        } else {
            throw new IllegalArgumentException(
                    "Invalid parmeter \""
                            + selectedOrAll
                            + "\" in ShowCopyGridsDialog. Value must be \"selected\" or \"all\".");
        }
        return new CopyGridsDialog(shell, dm, isSelected);
    }
}
