Feature: Location Changing

  Background:

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

  Scenario Outline: Login to e-Devlet and click location change button

    And type tck "<tck>"
    #tc kimlik no girme kısmına tıklıyor ve tc kimlik no'sunu yazdırıyor.

    And type password "<password>"
    #şifre girme kısmına tıklıyor ve şifreyi yazdırıyor.

    And click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    And navigate to location link
    #ikametgah bilgilerinin yer aldığı sekmeye yönlendiriyor.

    When click on adres degisiklik button
    #adres değişiklik bildirimi butonuna tıklıyor.

    Then check the service info message
    #adres değişikliği sayfasının yüklenip yüklenmediğini kontrol ediyor.

    Examples:
      | tck | password |