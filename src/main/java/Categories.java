public enum Categories {

    CLOTHES("clothes", new String[]{"Leather", "Linen", "Silk", "Wool"}),
    HERBS("herbs", new String[]{"Cherry Blossom", "Marigold", "Rose", "Seaweed"}),
    METALS("metals", new String[]{"Copper", "Gold", "Iron", "Silver"}),
    WEAPONS("weapons", new String[]{"Axe", "Dagger", "Mace", "Sword"});

    private String name;
    private String[] subcategories;

    private Categories(String name, String[] subcategories) {
        this.name = name;
        this.subcategories = subcategories;
    }

    public String getName() {
        return name;
    }

    public String[] getSubcategories() {
        return subcategories;
    }
}


