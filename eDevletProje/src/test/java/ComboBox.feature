Feature: Select the given value on given comboBox

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select the comboBox and value

    Given open the website
    #e-devlet sitesini açıyor.

    And use data given in "<file>"
    #verilen dosyadaki tck ve password verileriyle giriş yapıyor.

    When navigate to the given link "<link>"
    #verilen linke yönlendiriyor.

    And click on the combo box "<box>" and select "<element>"
    #id'si verilen comboBox elementinde verilen değeri seçiyor. Onay için verification mesajı yazıyor.

    Examples:
      | file          | link                                                                                    | box         | element |
      | dataFile.json | https://www.turkiye.gov.tr/tekirdag-buyuksehir-belediyesi-talep-oneri-basvuru-sorgulama | basvuruTipi | TALEP   |