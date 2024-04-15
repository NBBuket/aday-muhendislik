Feature: Select the given textArea box and write the given text

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select the textArea box and write

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

    And click on the textArea box "<textAreaBox>" and write "<text>"
    #id'si verilen textArea elementini seçip verilen text'i yazdırır.

    Examples:
      | tck | password | link | textAreaBox | text |