Feature: Select the given text box and write the given text

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select the text box and write

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

    And click on the text box "<textBox>" and write "<text>"
    #id'si verilen text elementini seçip verilen text'i yazdırır. Yazılan text ve gönderilenin aynı olup olmaması kontrol edilir.

    Examples:
      | tck | password | link | textBox | text |