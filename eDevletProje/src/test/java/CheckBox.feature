#hala id telefon olduğunda düzgün çalışmıyor, en olası sebep internet hızı gibi görünüyor.

Feature: Select the given value on given checkBox

  Scenario Outline: Login to the e-Devlet page, navigate to the link, select the checkBox and value

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

    Then click on the check box "<box>" and select
    #id'si verilen checkBox elementini seçiyor. Elementi seçtiğinde doğrulama için konsola da yazdırıyor.

    Examples:
      | file          | link                                                                                    | box      |
      | dataFile.json | https://www.turkiye.gov.tr/tekirdag-buyuksehir-belediyesi-talep-oneri-basvuru-sorgulama | cevapSMS |