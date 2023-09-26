package EnumKlassenTypenUndAttacken

import PokemonTyp




//Eine Liste mit all meinen Angriffen, abgespeichert in einer enum class.


enum class PokemonAttacke(
    val typ: PokemonTyp,
    val schaden: Int,
    val genauigkeit: Int,
    val physischSpezial: String,
    val schild: Boolean = false) {

    Hydropumpe(PokemonTyp.WASSER, 110, 80, "Spezial"),
    Orkan(PokemonTyp.FLUG, 110, 70, "Spezial"),
    Eisstrahl(PokemonTyp.EIS, 90, 100, "Spezial"),
    Hausbruch(PokemonTyp.NORMAL, 0, 100, "Physisch"),
    Schutzschild(PokemonTyp.NORMAL, 0, 100, "Physisch", true),
    Donner(PokemonTyp.ELEKTRO, 110, 70, "Spezial"),
    Hitzewelle(PokemonTyp.FEUER, 95, 90, "Spezial"),
    Ruheort(PokemonTyp.FLUG, 0, 100, "Physisch"),
    Psychokinese(PokemonTyp.PSYCHO, 90, 100, "Spezial"),
    Sonnentag(PokemonTyp.FEUER, 0, 100, "Physisch"),
    Solarstrahl(PokemonTyp.PFLANZE, 120, 100, "Spezial"),
    Feuersturm(PokemonTyp.FEUER, 110, 85, "Spezial"),
    Brandsand(PokemonTyp.BODEN, 70, 100, "Spezial"),
    Luftschnitt(PokemonTyp.FLUG, 75, 95, "Spezial"),
    Erdbeben(PokemonTyp.BODEN, 100, 100, "Physisch"),
    Feuerschlag(PokemonTyp.FEUER, 75, 100, "Physisch"),
    Protzer(PokemonTyp.NORMAL, 0, 100, "Physisch"),
    Läuterfeuer(PokemonTyp.FEUER, 100, 95, "Physisch"),
    Fruststampfer(PokemonTyp.BODEN, 75, 100, "Physisch"),
    Erdkräfte(PokemonTyp.BODEN, 90, 100, "Spezial"),
    Matschbombe(PokemonTyp.GIFT, 90, 100, "Spezial"),
    Schlafpuder(PokemonTyp.PFLANZE, 0, 75, "Spezial"),
    Drachenpuls(PokemonTyp.DRACHE, 85, 100, "Spezial"),
    Donnerblitz(PokemonTyp.ELEKTRO, 90, 100, "Spezial"),
    Meteorologe(PokemonTyp.NORMAL, 50, 100, "Spezial"),
    Rückenwind(PokemonTyp.FLUG, 0, 100, "Physisch"),
    Mondgewalt(PokemonTyp.FEE, 95, 100, "Spezial"),
    Synthese(PokemonTyp.PFLANZE, 0, 100, "Physisch"),
    Regentanz(PokemonTyp.WASSER, 0, 100, "Physisch"),
    Eruption(PokemonTyp.FEUER, 150, 100, "Spezial"),     //variiert, 150* (aktuelle kp/ max kp)
    Kaskade(PokemonTyp.WASSER, 80, 100, "Physisch"),
    Drachentanz(PokemonTyp.DRACHE, 0, 100, "Physisch"),
    Aquadurchstoß(PokemonTyp.WASSER, 85, 100, "Physisch"),
    Wutanfall(PokemonTyp.DRACHE, 120, 100, "Physisch");
}
