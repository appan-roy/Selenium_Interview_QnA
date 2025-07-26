package interviewQnA;

public class ExtractName {

    public static void main(String[] args) {

        String str = "2534Appan638457Sing7384ha19273Ro53436y";

        str = str.replaceAll("[0-9]", "");

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(i != 0 & Character.isUpperCase(str.charAt(i)))
                output.append(" ");
            output.append(str.charAt(i));
        }

        System.out.println(output);

    }

}
