OnClickZadanie2
Użyte sposoby podpięcia kliknięcia
1. **Lambda** – przycisk Reset
2.  `findViewById(R.id.btnReset).setOnClickListener`
3. **Wspólny listener** – przyciski +1 i −1  
   `View.OnClickListener changeListener;`
Obsługa błędu
Aplikacja nie pozwala zejść poniżej zera.  
Przy próbie kliknięcia −1 gdy licznik = 0, pokazuje Błąd.

Zrzut ekranu
![Zrzut ekranu](Zad2OnClick.png)
