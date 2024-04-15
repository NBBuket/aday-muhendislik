Feature: Login and Navigate Test

  Scenario Outline: Login to the e-Devlet page and navigate to the given link

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

    Then click the button "<button>"
    #değeri verilen butona tıklar.

    Examples:
      | tck | password | link | button |