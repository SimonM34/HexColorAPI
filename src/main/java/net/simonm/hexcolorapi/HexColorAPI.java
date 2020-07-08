package net.simonm.hexcolorapi;

import net.md_5.bungee.api.ChatColor;
import net.simonm.hexcolorapi.colors.HexColor;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HexColorAPI {
    public static final Pattern HEX_REGEX_PATTERN = Pattern.compile("(#<[A-z0-9]{1,6}>)");
    public static final Pattern NAMED_REGEX_PATTERN;

    static {
        NAMED_REGEX_PATTERN = Pattern.compile("(?i)%(" +
                Arrays.stream(HexColor.values())
                        .map(Enum::name)
                        .collect(Collectors.joining("|")) +
                ")%");
    }

    public static String parseColor(String text) {
        return parseSpigotColor(parseHexColor(parseNamedHexColor(text))); // yuck but oh well
    }
    public static String parseHexColor(String text) {
        if (!text.contains("#") && !text.contains("<") && !text.contains(">")) // no need to check if there aren't any symbols we need
            return text;

        Matcher matcher = HEX_REGEX_PATTERN.matcher(text);
        while (matcher.find()) {
            StringBuilder builder = new StringBuilder("§x");
            String hex = matcher.group();

            char[] characters = hex.toCharArray();
            for (int i = 2; i < characters.length - 1; ++i)
                builder.append("§").append(characters[i]);
            if (characters.length < 9)
                for (int i = 0; i < 9 - characters.length; i++)
                    builder.append("§").append(characters[characters.length - 2]);
            text = text.replace(hex, builder.toString());
        }
        return text;
    }
    public static String parseNamedHexColor(String text) {
        if (!text.contains("%"))
            return text;

        Matcher matcher = NAMED_REGEX_PATTERN.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            HexColor hexColor = HexColor.ALL_COLORS.get(group.toUpperCase());
            if (hexColor != null) {
                text = text.replace(group, hexColor.toString());
            }
        }
        return text;
    }
    public static String parseSpigotColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
