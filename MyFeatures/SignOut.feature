Feature: Users Sign Out
  Description: The Users signed out of Sakankom System
  Actor: All Users

  Background:
    Given the users credentials

       |Marah     |marah123|0595642327|Nublus  |Admin |
      |Bayan     |bayan123|0595642328|Tulkrem |Owner|
      |Ahmad     |ahmad123|0595642329|Jenin   |tenants|

  Scenario Outline: the <role> signed out
    Given that the <role> is signed in
    When the <role> signs out
    Then the <role> is not signed in

    Examples:
      |username    |password  |phone     |address  |role|
      |"Marah"     |"marah123"|0595642327|Nubles   |"Admin" |
      |"Bayan"     |"bayan123"|0595642328|Tulkrem  |"Owner"|
      |"Ahmad"     |"ahmad123"|0595642329|Jenin    |"tenants"|
 
