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
package com.raytheon.uf.edex.registry.acp.xacml.engine.function.impl;

import javax.naming.ldap.LdapName;

import com.raytheon.uf.edex.registry.acp.xacml.engine.function.XACMLFunction;


/**
 * 
 *
 *
 * <pre>
 * 
 * SOFTWARE HISTORY
 * 
 * Date         Ticket#     Engineer    Description
 * ------------ ----------  ----------- --------------------------
 * 8/17/2012    724          bphillip    Initial Coding
 * </pre>
 * 
 * @author bphillip
 * @version 1
 */
public class X500NameEqual extends XACMLFunction {

    private static final String FUNCTION_ID = "urn:oasis:names:tc:xacml:1.0:function:x500Name-equal";

    @Override
    public String getFunctionId() {
        return FUNCTION_ID;
    }

    public Boolean executeFunction(LdapName arg1, LdapName arg2) {
        if (arg1 == null) {
            return arg2 == null;
        }
        return arg1.equals(arg2);
    }
}
