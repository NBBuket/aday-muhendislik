Feature: Pick the given date

  Scenario Outline: Login to the e-Devlet page, navigate to the link, enter the given date

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

    And use data given in "<file>"
    #verilen dosyadaki tck ve password verileriyle giriş yapıyor.

    And click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    When navigate to the given link "<link>"
    #verilen linke yönlendirir.

    And pick the given date "<date>"
    #verilen tarihi ilgili alana yazdırır.

    Then check the date
    #Takvim görünümünü açarak seçilen tarihi takvim üzerinde gösterir.


    Examples:
      | file          | link                                                                      | date       |
      | dataFile.json | https://www.turkiye.gov.tr/tekirdag-buyuksehir-belediyesi-vefat-sorgulama | 13/07/2023 |