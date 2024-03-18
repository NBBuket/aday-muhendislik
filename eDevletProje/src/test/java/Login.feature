Feature: Login Test

  Scenario: Go to the e-Devlet page and login, open the location link

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

    And click TC Kimlik No area
    #tc kimlik no girme kısmına tıklıyor.

    And type tck
    #tc kimlik no'sunu yazdırıyor.

    And click e-Devlet sifresi area
    #şifre girme kısmına tıklıyor.

    And type password
    #şifreyi yazdırıyor.

    And click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    When navigate to location link
    #ikametgah bilgilerinin yer aldığı sekmeye yönlendiriyor.

    Then check the left info area
    #solda yer alan bilgi mesajının doğruluğunu kontrol ediyor.