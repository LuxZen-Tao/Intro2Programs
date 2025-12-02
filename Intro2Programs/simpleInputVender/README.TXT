/**
 * Vending machine with snack options 1-4/5 exits.
 * @author (Luke Brighton = LB837)
 * With Kanji
What the Vending Machine Print outs are supposed to look like. (for visual reference)
 */
public class VendingMachine
{
    private InputReader reader;

    private int numberOfGum;
    private int numberOfChocolate;
    private int numberOfPopcorn;
    private int numberOfJuice;

    public VendingMachine() {
        reader = new InputReader();
        numberOfGum = 0;
        numberOfChocolate = 0;
        numberOfPopcorn = 0;
        numberOfJuice = 0;
    }

    public void run() {
        boolean finished = false;

        while (!finished) {
            System.out.println("    >>>>>>>Vending Machine Menu<<<<<<<");
            System.out.println("              ( 自動販売機メニュー )   ");
            System.out.println("    #================================#");
            System.out.println("    # === 1. Gum (ガム)           ===  #");
            System.out.println("    # === 2. Chocolate (チョコレート) ===  #");
            System.out.println("    # === 3. Popcorn (ポップコーン)   ===  #");
            System.out.println("    # === 4. Juice (ジュース)       ===  #");
            System.out.println("    # === 5. Quit (やめる)         ===  #");
            System.out.println("    #================================#");
            
            
            System.out.println("             **************");
            System.out.println("        Please choose an option:");
            System.out.println("         ( オプションを選択してください: )");
            System.out.print("                   ");

            int choice = reader.getInt("");
            

            switch (choice) {
                case 1:
                    numberOfGum++;
                    System.out.println("\n    vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                    System.out.println("          Please take your gum! Chew responsibly! ");
                    System.out.println("         ( ガムをどうぞお持ちください！ 適度に噛んでください！ ) ");
                    System.out.println("    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    break;
                case 2:
                    numberOfChocolate++;
                    System.out.println("\n   vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                    System.out.println("    Chocolate is not a sustainable substitute for oxytocin! Enjoy");
                    System.out.println("    (チョコレートはオキシトシンの持続可能な代替品ではありません！ 楽しんでください)  ");
                    System.out.println("   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    break;
                case 3:
                    numberOfPopcorn++;
                    System.out.println("\n    vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                    System.out.println("        Salted & Sweet mixed popcorn! Some popping required");
                    System.out.println("        ( 塩味と甘味のミックスポップコーン！弾けるのに少し手間がかかります )  ");
                    System.out.println("    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    break;
                case 4:
                    numberOfJuice++;
                    System.out.println("\n    vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
                    System.out.println("      Hangover fixer aka OJ dispensed!");
                    System.out.println("      ( 二日酔い対策、オレンジジュースが出ました！ )  ");
                    System.out.println("    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
                    break;
                case 5:
                    System.out.println( "\n    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println( "  [ Thank you for using this Vending machine ]");
                    System.out.println( "  [  ---  Off-Brand Vending machine Co.  --- ]");
                    System.out.println( "  [   ---      入門2 プログラミング2025       ---     ]");
                    System.out.println( "    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    finished = true;
                    break;
                default:
                    System.out.println("\n  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("  @     ⛔ There is no option for " + choice + " ⛔   @");
                    System.out.println("  @ ⛔ Please chose from the availible options! ⛔ @");
                    System.out.println("  @      ⛔ (オプションはありません " + choice + " ) ⛔    @");
                    System.out.println("  @       ⛔ (利用可能なオプションから選択してください。) ⛔   @");
                    System.out.println("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
                    break;
            }
        }
    }

    /**
     * Display how many of each item have been sold so far.
     */
    public void displayTotals() {
        System.out.println("    //////////////Z - REPORT///////////// ");
        System.out.println("    //  " + numberOfGum + " items of gum were sold       //");
        System.out.println("    //  " + numberOfChocolate + " items of chocolate were sold //");
        System.out.println("    //  " + numberOfPopcorn + " items of popcorn were sold   //");
        System.out.println("    //  " + numberOfJuice + " items of juice were sold     //");
        System.out.println("    //////////END OF Z - REPORT////////// ");
    }
}
