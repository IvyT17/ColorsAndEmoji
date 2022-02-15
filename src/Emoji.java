public class Emoji
{
    // constants: these are "unicode" characters that
    // each represent a color!
    private final String BLUE = "\u001B[34m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String CYAN = "\033[0;34m";
    private final String PURPLE = "\033[0;35m";

    // emoji example (unicode)
    private final String STRAWBERRY_EMOJI = "\uD83C\uDF53";

    // instance variable
    private String name;

    // constructor
    public Emoji(String name)
    {
        this.name = name;
    }

    public void introduce()
    {
        // adding color to the console
        // note how you append a color string to change its color
        System.out.println(CYAN + "Hello," + RED + " my name is " + BROWN + name);
        System.out.println(WHITE + "Cool huh?");
    }

    public void printFavoriteFoods()
    {
        // search for emoji icons here:  https://www.fileformat.info/info/unicode/char/search.htm
        // when you find one you like, scroll down to "C/C++/Java source code" and copy/paste that string
        System.out.println("My favorite foods are:");
        System.out.println("Children: \uD83E\uDDD2");
        System.out.println("Boba:\uD83E\uDDCB");
        System.out.println("Strawberry: " + STRAWBERRY_EMOJI);
        System.out.println("Ghosts: \uD83D\uDC7B");
    }

    // this method "throws exceptions" which is an
    // advanced topic you don't need to know for this course, but for more info
    // check out: https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html
    public void animate() throws InterruptedException
    {
        // helper method defined below
        System.out.print(PURPLE);
        System.out.println("                            (\\\n                             (\\");
        System.out.print(STRAWBERRY_EMOJI + "                           " + "(/\n                            (/");
        Thread.sleep(3000);

        System.out.print(BLUE);
        System.out.println("");
        System.out.println(STRAWBERRY_EMOJI + "                     " + "-------");
        Thread.sleep(3000);

        System.out.print(PURPLE);
        System.out.println("                       (\\\n                        (\\");
        System.out.print(STRAWBERRY_EMOJI + "                      " + "(/\n                       (/");
        Thread.sleep(3000);

        System.out.print(BLUE);
        System.out.println("");
        System.out.println(STRAWBERRY_EMOJI + "                " + "-------");
        Thread.sleep(3000);

        System.out.print(PURPLE);
        System.out.println("                (\\\n                 (\\");
        System.out.print(STRAWBERRY_EMOJI + "               " + "(/\n                (/");
        Thread.sleep(3000);

        System.out.print(BLUE);
        System.out.println("");
        System.out.println(STRAWBERRY_EMOJI + "          " + "-------");
        Thread.sleep(3000);

        System.out.print(PURPLE);
        System.out.println("         (\\\n          (\\");
        System.out.print(STRAWBERRY_EMOJI + "        " + "(/\n         (/");
        Thread.sleep(3000);

        System.out.print(BLUE);
        System.out.println("");
        System.out.println(STRAWBERRY_EMOJI + "  " + "-------");
        Thread.sleep(3000);

        System.out.print(PURPLE);
        System.out.println("  (\\\n   (\\");
        System.out.println(STRAWBERRY_EMOJI + " " + "(/\n  (/");
        Thread.sleep(3000);

        System.out.print(WHITE);
        System.out.println("  0_o  ");
        Thread.sleep(3000);

        System.out.println(CYAN + name + ": CHOMP CHOMP YUM!");
    }
}