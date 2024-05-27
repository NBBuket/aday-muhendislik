Feature: Pick the given date

  Scenario Outline: Login to the e-Devlet page, navigate to the link, enter the given date

    Given open the website
    #e-devlet sitesini açıyor.

    And use data given in "<file>"
    #verilen dosyadaki tck ve password verileriyle giriş yapıyor.

    When navigate to the given link "<link>"
    #verilen linke yönlendiriyor.

    And pick the given date "<date>"
    #verilen tarihi ilgili alana yazdırıyor.

    Then check the date
    #Takvim görünümünü açarak seçilen tarihi takvim üzerinde gösteriyor.

    Examples:
      | file          | link                                                                      | date       |
      | dataFile.json | https://www.turkiye.gov.tr/tekirdag-buyuksehir-belediyesi-vefat-sorgulama | 13/07/2023 |