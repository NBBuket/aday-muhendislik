Feature: Select the given text box and write the given text

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select the text box and write

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

    And use data given in "<file>"
    #verilen dosyadaki tck ve password verileriyle giriş yapıyor.

    And click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    When navigate to the given link "<link>"
    #verilen linke yönlendirir.

    And click on the text box "<textBox>" and write "<text>"
    #id'si verilen text elementini seçip verilen text'i yazdırır. Yazılan text ve gönderilenin aynı olup olmaması kontrol edilir.

    Examples:
      | file          | link                                                                                    | textBox | text       |
      | dataFile.json | https://www.turkiye.gov.tr/tekirdag-buyuksehir-belediyesi-talep-oneri-basvuru-sorgulama | cepTel  | 0123456789 |