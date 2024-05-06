Feature: Pick the given date

  Scenario Outline: Login to the e-Devlet page, navigate to the link, enter the given date

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

    And type tck "<tck>"
    #tc kimlik no girme kısmına tıklıyor ve tc kimlik no'sunu yazdırıyor.

    And type password "<password>"
    #şifre girme kısmına tıklıyor ve şifreyi yazdırıyor.

    And click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    When navigate to the given link "<link>"
    #verilen linke yönlendirir.

    And pick the given date "<date>"
    #verilen tarihi ilgili alana yazdırır.

    Then check the date
    #Takvim görünümünü açarak seçilen tarihi takvim üzerinde gösterir.


    Examples:
      | tck         | password | link                                                                      | date       |
      | 16051098538 | Bb1.Bb1. | https://www.turkiye.gov.tr/bahcelievler-belediyesi-nikah-salonu-sorgulama | 13/07/2025 |