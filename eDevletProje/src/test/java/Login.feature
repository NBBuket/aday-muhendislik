Feature: Login Test

  Scenario Outline: Login to the e-Devlet page

    Given open the website
    #e-devlet sitesini açıyor.

    And click Giris Yap button
    #sağ üstteki giriş yap butonuna tıklıyor.

    And use data given in "<file>"
    #verilen dosyadaki tck ve password verileriyle giriş yapıyor.

    When click on giris yap button
    #ikinci kere giriş yap butonuna tıklayarak e-Devlet sistemine giriş yaptırıyor.

    Then check the main info
    #solda yer alan bilgi mesajının doğruluğunu kontrol ediyor.

    Examples:
      | file          |
      | dataFile.json |