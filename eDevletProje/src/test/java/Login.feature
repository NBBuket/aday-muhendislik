Feature: Login Test

  Scenario Outline: Login to the e-Devlet page

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

    And type tck "<tck>"
    #tc kimlik no girme kısmına tıklıyor ve tc kimlik no'sunu yazdırıyor.

    And type password "<password>"
    #şifre girme kısmına tıklıyor ve şifreyi yazdırıyor.

    When click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    Then check the main info
    #solda yer alan bilgi mesajının doğruluğunu kontrol ediyor.

    Examples:
      | tck | password |