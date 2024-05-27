Feature: Login Test

  Scenario Outline: Login to the e-Devlet page

    Given open the website
    #e-devlet sitesini açıyor.

    And use data given in "<file>"
    #verilen dosyadaki tck ve password verileriyle giriş yapıyor.

    Then check the main info
    #solda yer alan bilgi mesajının doğruluğunu kontrol ediyor.

    Examples:
      | file          |
      | dataFile.json |