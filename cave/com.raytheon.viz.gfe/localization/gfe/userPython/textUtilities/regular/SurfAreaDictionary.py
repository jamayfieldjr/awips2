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
# Example using site TBW
#
#  Additional Edit Areas that needed to be created:
#
#  landSeaAreas:
#     SRF_850, SRF_853, SRF_856
#
#  surfAreas:
#     NorthCoast1 (listed with FLZ039), SouthCoast  (along GMZ850)
#     NorthCoast2 (listed with FLZ042), SouthCoast  (along GMZ850)
#
# TBW always runs with the same combinations:
#   FLZ039-FLZ042-FLZ048-FLZ049
#   FLZ050-FLZ051-FLZ055-FLZ060
#   FLZ062-FLZ065
# Thus, additional entries need only be listed for at least one zone
# in each combination.
#
# If you want to combine zones on-the-fly, you should list additional areas
# for each zone and the system will take care to combine them appropriately.
# For example, note that the "surfAreas" are listed for both FLZ039 and FLZ042.
# When they are combined, the surfAreas are reported just once, as desired.


AreaDictionary = {

 'FLZ039': {'fullStateName': 'Florida',
            'partOfState': 'northern',
            'stateAbbr': 'FL',
            'ugcCityString': '...Cedar Key...Hudson Beach...McKethan Pine Island Park',
            'ugcCode': 'FLZ039',
            'ugcName': 'Levy',
            'ugcTimeZone': 'EST5EDT',
            'landSeaArea': 'SRF_850',
            'marineArea':  'GMZ850',
            'surfAreas': [
                   ('NorthCoast1', 'Surf along north facing reefs.............'),
                   ('SouthCoast', 'Surf along south facing reefs.............')
                   ],
            'uviCity': "Tampa",  # City for which UVI should be listed
            'tideTables':   ["Cedar Key", "Venice Inlet"],
            },
 'FLZ042': {'fullStateName': 'Florida',
            'partOfState': 'west central',
            'stateAbbr': 'FL',
            'ugcCityString': '',
            'ugcCode': 'FLZ042',
            'ugcName': 'Citrus',
            'ugcTimeZone': 'EST5EDT',
            'surfAreas': [
                   ('NorthCoast2', 'Surf along north facing reefs.............'),
                   ('SouthCoast', 'Surf along south facing reefs.............')
                   ],
            },
 'FLZ048': {'fullStateName': 'Florida',
            'partOfState': 'west central',
            'stateAbbr': 'FL',
            'ugcCityString': '',
            'ugcCode': 'FLZ048',
            'ugcName': 'Hernando',
            'ugcTimeZone': 'EST5EDT'},
 'FLZ049': {'fullStateName': 'Florida',
            'partOfState': 'west central',
            'stateAbbr': 'FL',
            'ugcCityString': "",
            'ugcCode': 'FLZ049',
            'ugcName': 'Pasco',
            'ugcTimeZone': 'EST5EDT'},

 #############

 'FLZ050': {'fullStateName': 'Florida',
            'partOfState': 'west central',
            'stateAbbr': 'FL',
            'ugcCityString': '...Bradenton Beach...Clearwater Beach...Siesta Key...Saint pete Beach...Venice Beach',
            'ugcCode': 'FLZ050',
            'ugcName': 'Pinellas',
            'ugcTimeZone': 'EST5EDT',
            'landSeaArea': 'SRF_853',
            'marineArea':  'GMZ853',
            'surfAreas': [],
            'uviCity': "Tampa",
            'tideTables':  ["Saint Petersburg", "Fort Myers"],
            },
 'FLZ051': {'fullStateName': 'Florida',
            'partOfState': 'west central',
            'stateAbbr': 'FL',
            'ugcCityString': '',
            'ugcCode': 'FLZ051',
            'ugcName': 'Hillsborough',
            'ugcTimeZone': 'EST5EDT'},
 'FLZ055': {'fullStateName': 'Florida',
            'partOfState': 'west central',
            'stateAbbr': 'FL',
            'ugcCityString': '',
            'ugcCode': 'FLZ055',
            'ugcName': 'Manatee',
            'ugcTimeZone': 'EST5EDT'},
 'FLZ060': {'fullStateName': 'Florida',
            'partOfState': 'west central',
            'stateAbbr': 'FL',
            'ugcCityString': '',
            'ugcCode': 'FLZ060',
            'ugcName': 'Sarasota',
            'ugcTimeZone': 'EST5EDT'},

 ###################
 
 'FLZ062': {'fullStateName': 'Florida',
            'partOfState': 'Southwest',
            'stateAbbr': 'FL',
            'ugcCityString': '...Boca Grande...Englewood',
            'ugcCode': 'FLZ062',
            'ugcName': 'Charlotte',
            'ugcTimeZone': 'EST5EDT',
            'landSeaArea': 'SRF_856',
            'marineArea':  'GMZ856',
            'surfAreas': [],
            'uviCity': "Tampa",
            'tideTables':  ["Venice Inlet"],
            },
 'FLZ065': {'fullStateName': 'Florida',
            'partOfState': 'Southwest',
            'stateAbbr': 'FL',
            'ugcCityString': '...Fort Myers Beach...Sanibel Island',
            'ugcCode': 'FLZ065',
            'ugcName': 'Lee',
            'ugcTimeZone': 'EST5EDT',
            },

 }
    
