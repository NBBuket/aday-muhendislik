Feature: Login Test

  Background:

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

  Scenario Outline: Go to the e-Devlet page and login, open the location link

    And type tck "<tck>"
    #tc kimlik no girme kısmına tıklıyor ve tc kimlik no'sunu yazdırıyor.

    And type password "<password>"
    #şifre girme kısmına tıklıyor ve şifreyi yazdırıyor.

    And click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    When navigate to location link
    #ikametgah bilgilerinin yer aldığı sekmeye yönlendiriyor.

    Then check the left info area
    #solda yer alan bilgi mesajının doğruluğunu kontrol ediyor.

    Examples:
      | tck | password |