package interviewQnA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayJoining {

    public static void main(String[] args) {

        String[] batsmen = {"Shikhar", "Rohit", "Virat", "Lokesh", "Shreyas", "Rishabh"};
        String[] bowlers = {"Hardik", "Bhuvi", "Jaddu", "Bumrah", "Chahal"};

        // Method 1 - using list
        List<String> team_list = new ArrayList<>();

        for (String string : batsmen) {
            team_list.add(string);
        }

        for (String string : bowlers) {
            team_list.add(string);
        }

        System.out.println(team_list);

        // Method 2 - using array
        String[] team = new String[batsmen.length + bowlers.length];

        for (int i = 0; i < batsmen.length; i++) {
            team[i] = batsmen[i];
        }

        for (int i = 0; i < bowlers.length; i++) {
            team[batsmen.length + i] = bowlers[i];
        }

        for (String s : team) {
            System.out.println(s);
        }

    }

}
