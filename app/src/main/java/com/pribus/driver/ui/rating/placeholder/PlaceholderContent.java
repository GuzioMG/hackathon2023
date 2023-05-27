package com.pribus.driver.ui.rating.placeholder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    public static final List<PlaceholderItem> ITEMS = new ArrayList<PlaceholderItem>();

    /**
     * A map of sample (placeholder) items, by ID.
     */
    public static final Map<String, PlaceholderItem> ITEM_MAP = new HashMap<String, PlaceholderItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createPlaceholderItem(i));
        }
    }

    private static void addItem(PlaceholderItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static PlaceholderItem createPlaceholderItem(int position) {
        return new PlaceholderItem(""+position, position+".5.2023", "Trasa " + position, "Wrumwrum", "Wypierdzisz Wielki", "Wypierdzisz Mały", position);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A placeholder item representing a piece of content.
     */
    public static class PlaceholderItem {
        public final String date;
        public final String trasa;
        public final String pojazd;
        public final String in;
        public final String out;
        public final String ocena;
        public final String id;

        public PlaceholderItem(String id, String date, String trasa, String pojazd, String in, String out, int ocena) {
            this.date = date;
            this.trasa = trasa;
            this.pojazd = pojazd;
            this.in = in;
            this.out = out;
            this.ocena = ocena + "/5";
            this.id = id;
        }
    }
}