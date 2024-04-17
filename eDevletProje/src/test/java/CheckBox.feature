Feature: Select the given value on given checkBox

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select the checkBox and value

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

    Then click on the check box "<box>" and select
    #id'si verilen checkBox elementini seçiyor. Elementi seçtiğinde doğrulama için konsola da yazdırıyor.

    Examples:
      | tck | password | link | box |