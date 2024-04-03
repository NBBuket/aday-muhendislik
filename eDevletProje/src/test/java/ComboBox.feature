Feature: Select the given value on given comboBox

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select the comboBox and value

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

    And click on the combo box "<box>" and select "<element>"
    #id'si verilen comboBox elemanında verilen değeri seçiyor.

    Examples:
      | tck | password | link | box | element |