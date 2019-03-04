# ELTERobotIndustry

Készítsünk programot, amellyel szimulálni tudjuk ipari robotok működését. 
A robotok egy raktárban dolgoznak, és a feladatuk áruk helyrevitele. 
A robotok árammal működnek, minden nap elején adott mennyiséggel tölthetik fel az akkumulátoraikat. 
Ennek során az akkumulátor töltési szintje nő, de a maximális töltési kapacitást nem haladhatja meg. 
A feltöltés után kezdik meg az áruk szállítását, ennek során az akkumulátor töltése csökken. 

A robotok sorban veszik fel az árukat.
Minden robot annyi árut vesz fel, 
amennyi a tényleges szállítási kapacitásának és a még szállításra váró áruk mennyiségének a minimuma. 
Az egyes robotok tényleges szállítási kapacitása nem haladhatja meg a maximális értéket,
de a lehető legnagyobb olyan érték, hogy a szállítás után az akkumulátor töltési szintje nem lehet negatív. 

Egy robot egy nap csak egyszer vesz fel árut. 
Ha egy adott nap a robotok nem tudják az összes beérkezett árut helyre vinni, akkor a maradék a következő napra marad.

A munkában háromféle robot vesz részt:
• Mac: 
Maximális töltési szintje 10, 
maximális szállítási kapacitása 10 egység,
egy egység szállítása eggyel csökkenti a töltési szintet.

• Eco: 
Maximális töltési szintje 4, 
maximális szállítási kapacitása 6, 
két egység szállítása eggyel csökkenti a töltési szintet. 
(Páratlan egység szállításakor a pár nélkül maradó egység is eggyel csökkent, 
azaz 5 egység esetén 3 lenne a fogyasztás.)

• Pro: 
Maximális töltési szintje 12, 
maximális szállítási kapacitása 8.
Egy egység szállítása 5 egységig eggyel csökkenti a töltési szintet, 
az 5 feletti egységek kettővel (Pl. 7 egység esetén 5+4=9 a fogyasztás.)

A szimuláció adatait egy szövegfájl tartalmazza a következő formátumban. 
Az első sorban szerepelnek az időszak napjainak adatai. 
Először a napok száma, majd minden napról először a töltési mennyiség, aztán a beérkező áruk egysége. 

Ezután soronként adottak az egyes robotok adatai. 
A sor első eleme a robot fajtája, ezt követi a robot neve, végül a robot akkumulátorának kezdeti töltöttsége szerepel a sorban.
A program kérje be a fájl nevét, majd a szimuláció végén írja ki, az egyes robotok mennyi árut szállítottak a vizsgált időszak alatt. 
Ehhez valósítsuk meg a robotokat reprezentáló osztályokat, amelyek egy absztrakt robot osztály leszármazottai.

Egy lehetséges bemenet:
4 nap: 3, 20; 2, 32; 5, 20; 3, 16

Mac MM10 4,
Eco E5 3,
Pro PX 10,
Eco E12 4.
