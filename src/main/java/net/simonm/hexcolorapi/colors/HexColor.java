package net.simonm.hexcolorapi.colors;

import net.simonm.hexcolorapi.HexColorAPI;

import java.util.HashMap;
import java.util.Map;

public enum HexColor {
    // reds
    INDIAN_RED("CD5C5C"),
    LIGHT_CORAL("F08080"),
    SALMON("FA8072"),
    DARK_SALMON("E9967A"),
    LIGHT_SALMON("FFA07A"),
    CRIMSON("DC143C"),
    RED("FF0000"),
    FIRE_BRICK("B22222"),
    DARK_RED("8B0000"),

    // pinks
    PINK("FFC0CB"),
    LIGHT_PINK("FFB6C1"),
    HOT_PINK("FF69B4"),
    DEEP_PINK("FF1493"),
    MEDIUM_VIOLET_RED("C71585"),
    PALE_VIOLET_RED("DB7093"),

    // oranges
    CORAL("FF7F50"),
    TOMATO("FF6347"),
    ORANGE_RED("FF4500"),
    DARK_ORANGE("FF8C00"),
    ORANGE("FFA500"),

    // yellows
    GOLD("FFD700"),
    YELLOW("FFFF00"),
    LIGHT_YELLOW("FFFFE0"),
    LEMON_CHIFFON("FFFACD"),
    LIGHT_GOLDEN_ROD_YELLOW("FAFAD2"),
    PAPAYA_WHIP("FFEFD5"),
    MOCCASIN("FFE4B5"),
    PEACH_PUFF("FFDAB9"),
    PALE_GOLDENROD("EEE8AA"),
    KHAKI("F0E68C"),
    DARK_KHAKI("BDB76B"),

    // purples
    LAVENDER("E6E6FA"),
    THISTLE("D8BFD8"),
    PLUM("DDA0DD"),
    VIOLET("EE82EE"),
    ORCHID("DA70D6"),
    FUCHSIA("FF00FF"),
    MAGENTA("FF00FF"),
    MEDIUM_ORCHID("BA55D3"),
    MEDIUM_PURPLE("9370DB"),
    REBECCA_PURPLE("663399"),
    BLUE_VIOLET("8A2BE2"),
    DARK_VIOLET("9400D3"),
    DARK_ORCHID("9932CC"),
    DARK_MAGENTA("8B008B"),
    PURPLE("800080"),
    INDIGO("4B0082"),
    SLATE_BLUE("6A5ACD"),
    DARK_SLATE_BLUE("483D8B"),
    MEDIUM_SLATE_BLUE("7B68EE"),

    // greens
    GREEN_YELLOW("ADFF2F"),
    CHARTREUSE("7FFF00"),
    LAWN_GREEN("7CFC00"),
    LIME("00FF00"),
    LIME_GREEN("32CD32"),
    PALE_GREEN("98FB98"),
    LIGHT_GREEN("90EE90"),
    MEDIUM_SPRING_GREEN("00FA9A"),
    SPRING_GREEN("00FF7F"),
    MEDIUM_SEA_GREEN("3CB371"),
    SEA_GREEN("2E8B57"),
    FOREST_GREEN("228B22"),
    GREEN("008000"),
    DARK_GREEN("006400"),
    YELLOW_GREEN("9ACD32"),
    OLIVE_DRAB("6B8E23"),
    OLIVE("808000"),
    DARK_OLIVE_GREEN("556B2F"),
    MEDIUM_AQUAMARINE("66CDAA"),
    DARK_SEA_GREEN("8FBC8B"),
    LIGHT_SEA_GREEN("20B2AA"),
    DARK_CYAN("008B8B"),
    TEAL("008080"),

    // blues
    AQUA("00FFFF"),
    CYAN("00FFFF"),
    LIGHT_CYAN("E0FFFF"),
    PALE_TURQUOISE("AFEEEE"),
    AQUAMARINE("7FFFD4"),
    TURQUOISE("40E0D0"),
    MEDIUM_TURQUOISE("48D1CC"),
    DARK_TURQUOISE("00CED1"),
    CADET_BLUE("5F9EA0"),
    STEEL_BLUE("4682B4"),
    LIGHT_STEEL_BLUE("B0C4DE"),
    POWDER_BLUE("B0E0E6"),
    LIGHT_BLUE("ADD8E6"),
    SKY_BLUE("87CEEB"),
    LIGHT_SKY_BLUE("87CEFA"),
    DEEP_SKY_BLUE("00BFFF"),
    DODGER_BLUE("1E90FF"),
    CORNFLOWER_BLUE("6495ED"),
    ROYAL_BLUE("4169E1"),
    BLUE("0000FF"),
    MEDIUM_BLUE("0000CD"),
    DARK_BLUE("00008B"),
    NAVY("000080"),
    MIDNIGHT_BLUE("191970"),

    // browns
    CORNSILK("FFF8DC"),
    BLANCHED_ALMOND("FFEBCD"),
    BISQUE("FFE4C4"),
    NAVAJO_WHITE("FFDEAD"),
    WHEAT("F5DEB3"),
    BURLY_WOOD("DEB887"),
    TAN("D2B48C"),
    ROSY_BROWN("BC8F8F"),
    SANDY_BROWN("F4A460"),
    GOLDENROD("DAA520"),
    DARK_GOLDENROD("B8860B"),
    PERU("CD853F"),
    CHOCOLATE("D2691E"),
    SADDLE_BROWN("8B4513"),
    SIENNA("A0522D"),
    BROWN("A52A2A"),
    MAROON("800000"),

    // whites
    WHITE("FFFFFF"),
    SNOW("FFFAFA"),
    HONEY_DEW("F0FFF0"),
    MINT_CREAM("F5FFFA"),
    AZURE("F0FFFF"),
    ALICE_BLUE("F0F8FF"),
    GHOST_WHITE("F8F8FF"),
    WHITE_SMOKE("F5F5F5"),
    SEA_SHELL("FFF5EE"),
    BEIGE("F5F5DC"),
    OLD_LACE("FDF5E6"),
    FLORAL_WHITE("FFFAF0"),
    IVORY("FFFFF0"),
    ANTIQUE_WHITE("FAEBD7"),
    LINEN("FAF0E6"),
    LAVENDER_BLUSH("FFF0F5"),
    MISTY_ROSE("FFE4E1"),

    // grays
    GAINSBORO("DCDCDC"),
    LIGHT_GRAY("D3D3D3"),
    SILVER("C0C0C0"),
    DARK_GRAY("A9A9A9"),
    GRAY("808080"),
    DIM_GRAY("696969"),
    LIGHT_SLATE_GRAY("778899"),
    SLATE_GRAY("708090"),
    DARK_SLATE_GRAY("2F4F4F"),
    BLACK("000000");

    public static final Map<String, HexColor> ALL_COLORS = new HashMap<>();
    private final String colorCode;

    HexColor(String colorCode) {
        this.colorCode = HexColorAPI.parseHexColor("#<" + colorCode + ">");
    }

    static {
        for (HexColor hexColor : values()) {
            ALL_COLORS.put("%" + hexColor.name() + "%", hexColor);
        }
    }

    @Override
    public String toString() {
        return colorCode;
    }
}
