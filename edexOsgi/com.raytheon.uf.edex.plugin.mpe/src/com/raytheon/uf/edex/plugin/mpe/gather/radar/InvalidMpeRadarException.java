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
package com.raytheon.uf.edex.plugin.mpe.gather.radar;

import com.raytheon.uf.edex.plugin.mpe.MpeException;

/**
 * Signals that a Radar file is invalid either because it does not contain the
 * expected information in the expected order or it is not even a Radar file.
 *
 * <pre>
 *
 * SOFTWARE HISTORY
 *
 * Date         Ticket#    Engineer    Description
 * ------------ ---------- ----------- --------------------------
 * Jun 27, 2016 4625       bkowal      Initial creation
 * Nov 22, 2016 5588       nabowle     Renamed.
 *
 * </pre>
 *
 * @author bkowal
 */

public class InvalidMpeRadarException extends MpeException {

    private static final long serialVersionUID = -8374281675945066772L;

    public InvalidMpeRadarException(String message) {
        super(message);
    }

    public InvalidMpeRadarException(String message, Throwable cause) {
        super(message, cause);
    }
}