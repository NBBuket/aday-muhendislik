Feature: Select the given text box and write the given text

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select the text box and write

    Given open the website
    #e-devlet sitesini açıyor.

    And use data given in "<file>"
    #verilen dosyadaki tck ve password verileriyle giriş yapıyor.

    When navigate to the given link "<link>"
    #verilen linke yönlendiriyor.

    And click on the text box "<textBox>" and write "<text>"
    #id'si verilen text elementini seçip verilen text'i yazdırıyor. Yazılan text ve gönderilenin aynı olup olmaması kontrol ediliyor.

    Examples:
      | file          | link                                                                                    | textBox | text       |
      | dataFile.json | https://www.turkiye.gov.tr/tekirdag-buyuksehir-belediyesi-talep-oneri-basvuru-sorgulama | cepTel  | 0123456789 |