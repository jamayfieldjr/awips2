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
import com.raytheon.viz.gfe.dialogs.WESaveDialog;
import com.raytheon.viz.ui.dialogs.CaveJFACEDialog;

/**
 * Action to show saveForecast dialog.
 * 
 * <pre>
 * SOFTWARE HISTORY
 * Date         Ticket#    Engineer    Description
 * ------------ ---------- ----------- --------------------------
 * Feb 27, 2008            Eric Babin  Initial Creation
 * Apr 17, 2008 875        bphillip    Added interaction with server
 * Oct 26, 2012 1287       rferrel     Changes for non-blocking WESaveDialog.
 * Aug 27, 2015 4749       njensen     Now extends GfeShowDialogHandler
 * 
 * </pre>
 * 
 */
public class ShowSaveForecastDialog extends GfeShowDialogHandler {

    @Override
    protected CaveJFACEDialog createDialog(Shell shell, DataManager dm,
            ExecutionEvent event) {
        return new WESaveDialog(shell, dm);
    }
}