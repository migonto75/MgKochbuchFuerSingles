import de.rhistel.logic.ConsoleReader;

public class Main {

    //region Konstanten
    private static final String APPLIKATION_NAME = "\nDas Kochbuch für Singles\n";
    public static final String AVAILABLE_RECIPES = "\nHier die verfügbaren Rezepte:";
    public static final String SELECT_RECIPE = "\nBitte wählen Sie ein Rezept aus:";
    public static final String INVALID_CHOICE = "\nUngültige Auswahl.";
    public static final String INGREDIENTS = "\nZutaten:";
    public static final String PREPARATION = "\nZubereitung:";
    public static final String SELECT_FOOD_DELIVERY = "\nWähle einen Lieferdienst:";
    public static final String PHONENUMBER_LIEFERANDO = "Telefonnummer: 0800 1234567";
    public static final String PHONENUMBER_PIZZA_HUT = "Telefonnummer: 0800 2345678";
    public static final String PHONENUMBER_DOMINOS = "Telefonnummer: 0800 3456789";
    public static final String INVALID_INPUT = "Ungültige Eingabe";
    public static final String DELIVERY_LIEFERANDO = "1. Lieferando";
    public static final String DELIVERY_PIZZA_HUT = "2. Pizza Hut";
    public static final String DELIVERY_DOMINO_S = "3. Domino's\n";
    //endregion Konstanten


    //region Variablen
    // String-Array für Rezepte
    private static final String[] recipes = {
            "Spiegelei",
            "Spagetti mit Tomatensoße",
            "Lieferdienst anrufen"
    };
    //endregion Variablen


    //region Methoden
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printApplicationName();
        outputRecipe();
        selectRecipe();
    }

    private static void printApplicationName() {
        System.out.println(APPLIKATION_NAME);
    }

    private static void outputRecipe() {
        System.out.println(AVAILABLE_RECIPES);
        for (int i = 0; i < recipes.length; i++) {
            System.out.println((i + 1) + ". " + recipes[i]);
        }
    }

    public static void selectRecipe() {
        // Useraufforderung
        System.out.println(SELECT_RECIPE);
        int userChoice = ConsoleReader.in.readPositivInt();

        if (userChoice >= 1 && userChoice <= recipes.length) {
            showRecipeDetails(userChoice - 1);
        } else {
            System.out.println(INVALID_CHOICE);
        }
    }

    private static void showRecipeDetails(int userChoice) {
        switch (userChoice) {
            case 0:
                friedEggRecipeOutput();
                break;
            case 1:
                spagettiRecipeOutput();
                break;
            case 2:
                callFoodDelivery();
                break;
            default:
                System.out.println(Main.INVALID_CHOICE);
                break;
        }
    }

    private static void friedEggRecipeOutput() {
        System.out.println(INGREDIENTS);
        System.out.println("* 2 Eier");
        System.out.println("* Salz und Pfeffer");
        System.out.println("* Butter");

        System.out.println(PREPARATION);
        System.out.println("1. Eier in einer Schüssel aufschlagen und mit Salz und Pfeffer würzen.");
        System.out.println("2. Butter in einer Pfanne erhitzen.");
        System.out.println("3. Eier in die Pfanne geben und bei mittlerer Hitze braten, bis sie goldbraun sind.");
        System.out.println("4. Spiegeleier auf einem Teller servieren.");
    }

    private static void spagettiRecipeOutput() {
        System.out.println(INGREDIENTS);
        System.out.println("* 500 g Spaghetti");
        System.out.println("* 1 Zwiebel");
        System.out.println("* 2 Knoblauchzehen");
        System.out.println("* 500 g Tomaten");
        System.out.println("* 1 EL Olivenöl");
        System.out.println("* Salz und Pfeffer");

        System.out.println(PREPARATION);
        System.out.println("1. Spaghetti nach Packungsanweisung kochen.");
        System.out.println("2. Zwiebel und Knoblauch fein hacken.");
        System.out.println("3. Tomaten in Würfel schneiden.");
        System.out.println("4. Olivenöl in einer Pfanne erhitzen und Zwiebel und Knoblauch darin glasig dünsten.");
        System.out.println("5. Tomaten und Salz und Pfeffer hinzufügen und bei mittlerer Hitze ca. 15 Minuten köcheln lassen.");
        System.out.println("6. Sauce zu den Spaghetti geben und servieren.");
    }

    private static void callFoodDelivery() {
        System.out.println(SELECT_FOOD_DELIVERY);
        System.out.println(DELIVERY_LIEFERANDO);
        System.out.println(DELIVERY_PIZZA_HUT);
        System.out.println(DELIVERY_DOMINO_S);

        int userInput = ConsoleReader.in.readInt();

        switch (userInput) {
            case 1:
                System.out.println(PHONENUMBER_LIEFERANDO);
                break;
            case 2:
                System.out.println(PHONENUMBER_PIZZA_HUT);
                break;
            case 3:
                System.out.println(PHONENUMBER_DOMINOS);
                break;
            default:
                System.out.println(INVALID_INPUT);
        }
    }
    //endregion Methoden
}


