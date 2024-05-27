Feature: Login and Navigate Test

  Scenario Outline: Login to the e-Devlet page and navigate to the given link

    Given open the website
    #e-devlet sitesini açıyor.

    And use data given in "<file>"
    #verilen dosyadaki tck ve password verileriyle giriş yapıyor.

    When navigate to the given link "<link>"
    #verilen linke yönlendiriyor.

    Then click the button "<button>"
    #değeri verilen butona tıklıyor.

    Examples:
      | file       | link                                                                                    | button |
      | dataFile.json | https://www.turkiye.gov.tr/tekirdag-buyuksehir-belediyesi-talep-oneri-basvuru-sorgulama | Başvur |