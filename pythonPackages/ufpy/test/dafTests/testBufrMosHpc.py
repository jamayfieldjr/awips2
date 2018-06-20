##
# This software was developed and / or modified by Raytheon Company,
# pursuant to Contract DG133W-05-CQ-1067 with the US Government.
#
# U.S. EXPORT CONTROLLED TECHNICAL DATA
# This software product contains export-restricted data whose
# export/transfer/disclosure is restricted by U.S. law. Dissemination
# to non-U.S. persons whether in the United States or abroad requires
# an export license or other authorization.
#
# Contractor Name:        Raytheon Company
# Contractor Address:     6825 Pine Street, Suite 340
#                         Mail Stop B8
#                         Omaha, NE 68106
#                         402.291.0100
#
# See the AWIPS II Master Rights File ("Master Rights File.pdf") for
# further licensing information.
##

from __future__ import print_function
from ufpy.dataaccess import DataAccessLayer as DAL

import baseBufrMosTestCase
import params
import unittest

#
# Test DAF support for bufrmosHPC data
#
#     SOFTWARE HISTORY
#
#    Date            Ticket#       Engineer       Description
#    ------------    ----------    -----------    --------------------------
#    01/19/16        4795          mapeters       Initial Creation.
#    04/11/16        5548          tgurney        Cleanup
#    04/18/16        5548          tgurney        More cleanup
#    12/07/16        5981          tgurney        Parameterize
#    12/20/16        5981          tgurney        Inherit all tests
#
#


class BufrMosHpcTestCase(baseBufrMosTestCase.BufrMosTestCase):
    """Test DAF support for bufrmosHPC data"""

    datatype = "bufrmosHPC"
    data_params = "forecastHr", "maxTemp24Hour"

    # All tests inherited from superclass