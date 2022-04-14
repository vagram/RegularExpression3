
public class Main {
    private static String englishString;
    public static void main(String[] args) {
        englishString = "I had never seen a house on fire before, so, one evening when I heard fire engines " +
                "with loud alarm bells rushing past my house. I quickly ran out and, a few streets away, joined a " +
                "large crowd of people. We could see the fire only from a distance because the police would not " +
                "allow any one near the building on fire." +
                "What a terrible scene I saw that day! Huge flames of fire were coming out of each floor, and black" +
                " and thick smoke spread all around. Four fire engines were engaged and the firemen in their uniform" +
                " were playing the hose on various parts of the building. Then the tall ladders of the fire engine " +
                "were stretched upwards. Some firemen climbed up with hoses in their hands. The continuous flooding " +
                "brought the fire under control but the building was completely destroyed. ";
        cleaningString();
        print();
    }
    public static void cleaningString() {
        englishString = englishString.replaceAll("\\p{Punct}", "");
        englishString = englishString.replaceAll("\\W+", "\n");
    }
    public static void print() {
        System.out.println(englishString);
    }
}
