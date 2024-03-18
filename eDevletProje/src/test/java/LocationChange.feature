Feature: Location Changing

  Scenario: Login to e-Devlet and click location change button

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

    And navigate to location link
    #ikametgah bilgilerinin yer aldığı sekmeye yönlendiriyor.

    When click on adres degisiklik button
    #adres değişiklik bildirimi butonuna tıklıyor.

    Then check the service info message
    #adres değişikliği sayfasının yüklenip yüklenmediğini kontrol ediyor.
